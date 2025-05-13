# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from mod_dlm_server.apis.default_api_base import BaseDefaultApi
import mod_dlm_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from mod_dlm_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictStr
from typing import Any, Optional
from typing_extensions import Annotated
from mod_dlm_server.models.element_create import ElementCreate
from mod_dlm_server.models.prefab_element import PrefabElement
from mod_dlm_server.security_api import get_token_apiKey, get_token_bearer

router = APIRouter()

ns_pkg = mod_dlm_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/element",
    responses={
        201: {"model": PrefabElement, "description": "The element was created successfully."},
        400: {"description": "Bad request."},
        401: {"description": "Authorization information is missing or invalid."},
    },
    tags=["default"],
    summary="Create a new element",
    response_model_by_alias=True,
)
async def create_element(
    element_create: Annotated[Optional[ElementCreate], Field(description="The element to create.")] = Body(None, description="The element to create."),
    token_apiKey: TokenModel = Security(
        get_token_apiKey
    ),
    token_bearer: TokenModel = Security(
        get_token_bearer
    ),
) -> PrefabElement:
    """Creates a new element in the database."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().create_element(element_create)


@router.get(
    "/element",
    responses={
        200: {"model": PrefabElement, "description": "The element was retrieved successfully."},
        400: {"description": "Bad request."},
        401: {"description": "Authorization information is missing or invalid."},
        404: {"description": "An element with the specified ID was not found."},
    },
    tags=["default"],
    summary="Get an element",
    response_model_by_alias=True,
)
async def get_element(
    id: Annotated[StrictStr, Field(description="A unique identifier for an element")] = Path(..., description="A unique identifier for an element"),
    token_apiKey: TokenModel = Security(
        get_token_apiKey
    ),
    token_bearer: TokenModel = Security(
        get_token_bearer
    ),
) -> PrefabElement:
    """Gets an element from the database."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_element(id)
