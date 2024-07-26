# coding: utf-8

"""
    mod-dlm API

    mod-dlm is an open source domain specific language to describe prefab construction elements. This project provides tools for defining entity models and automatically generating CRUD APIs, enabling suppliers to create and manage catalogs of their products easily.

    The version of the OpenAPI document: 1.0.7
    Contact: info@mod.construction
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json




from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class PrefabElementDocumentationAndComplianceCertifications(BaseModel):
    """
    PrefabElementDocumentationAndComplianceCertifications
    """ # noqa: E501
    certification_types: List[StrictStr] = Field(alias="certificationTypes")
    regulatory_approvals: List[StrictStr] = Field(alias="regulatoryApprovals")
    __properties: ClassVar[List[str]] = ["certificationTypes", "regulatoryApprovals"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of PrefabElementDocumentationAndComplianceCertifications from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of PrefabElementDocumentationAndComplianceCertifications from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "certificationTypes": obj.get("certificationTypes"),
            "regulatoryApprovals": obj.get("regulatoryApprovals")
        })
        return _obj


