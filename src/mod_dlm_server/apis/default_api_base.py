# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from mod_dlm_server.models.element_create import ElementCreate
from mod_dlm_server.models.prefab_element import PrefabElement
from mod_dlm_server.security_api import get_token_apiKey, get_token_bearer

class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def create_element(
        self,
        element_create: ElementCreate,
    ) -> PrefabElement:
        """Creates a new element in the database."""
        ...


    async def get_element(
        self,
        id: str,
    ) -> PrefabElement:
        """Gets an element from the database."""
        ...
