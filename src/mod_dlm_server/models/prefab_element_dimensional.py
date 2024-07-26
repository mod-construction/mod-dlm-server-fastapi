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




from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List
from mod_dlm_server.models.prefab_element_dimensional_width import PrefabElementDimensionalWidth
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class PrefabElementDimensional(BaseModel):
    """
    PrefabElementDimensional
    """ # noqa: E501
    width: PrefabElementDimensionalWidth
    height: PrefabElementDimensionalWidth
    length: PrefabElementDimensionalWidth
    __properties: ClassVar[List[str]] = ["width", "height", "length"]

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
        """Create an instance of PrefabElementDimensional from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of width
        if self.width:
            _dict['width'] = self.width.to_dict()
        # override the default output from pydantic by calling `to_dict()` of height
        if self.height:
            _dict['height'] = self.height.to_dict()
        # override the default output from pydantic by calling `to_dict()` of length
        if self.length:
            _dict['length'] = self.length.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of PrefabElementDimensional from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "width": PrefabElementDimensionalWidth.from_dict(obj.get("width")) if obj.get("width") is not None else None,
            "height": PrefabElementDimensionalWidth.from_dict(obj.get("height")) if obj.get("height") is not None else None,
            "length": PrefabElementDimensionalWidth.from_dict(obj.get("length")) if obj.get("length") is not None else None
        })
        return _obj

