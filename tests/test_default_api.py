# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictStr  # noqa: F401
from typing import Any, Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from mod_dlm_server.models.element_create import ElementCreate  # noqa: F401
from mod_dlm_server.models.prefab_element import PrefabElement  # noqa: F401


def test_create_element(client: TestClient):
    """Test case for create_element

    Create a new element
    """
    element_create = {"bounding_box":{"depth":1.4658129805029452,"width":0.8008281904610115,"height":6.027456183070403},"images":["https://example.com/images/clt-wall-front.png"],"installation_and_connectivity":"","dimensional":{"width":{"min":10,"max":20},"length":{"min":10,"max":20},"height":{"min":10,"max":20}},"structural_properties":{"wind_load_resistance":"2.5–4.0 kPa","load_bearing_capacity":{"maximum_load":5,"force_unit":"kN","load_distribution":"point","test_standard":"EN 1991-1-1"},"deflection_limit":5.962133916683182,"seismic_resistance":"0.167g < SDS ≤ 0.33g","safety_factor":1.5637376656633328},"lifecycle_and_maintenance":{"maintenance_requirements":"Regular cleaning and inspection.","warranty":"10 years warranty.","expected_lifespan":50},"description":"This CLT wall panel is suitable for multi-story residential buildings and meets fire resistance standards.","documentation_and_compliance":{"technical_specifications":"technicalSpecifications","certifications":{"certification_types":["certificationTypes","certificationTypes"],"regulatory_approvals":["regulatoryApprovals","regulatoryApprovals"]}},"sustainability":{"country_of_manufacturing":"countryOfManufacturing","recyclability":41.45608029883936,"classification":"A","energy_efficiency":"LEED Gold","voc_emissions":"Low (<0.3 mg/m³)"},"reuse_and_circularity":{"circularity_certification":"C2C_gold","reuse_potential":"recyclable","refurbishment_scope":"partial","disassembly_rating":"3"},"product_category":{"building_system":"Facade","category":"Structural Insulated Panels (SIPs)"},"bim_model_url":"https://example.com/models/clt-wall.ifc","aesthetic_and_customization_options":{"color_options":["colorOptions","colorOptions"],"texture":"texture","modular_adaptability":"modularAdaptability"},"performance":{"thermal_transmittance":0.46042717738695305,"fire_resistance":{"reaction_to_fire_classification":"A1","fire_resistance_duration":"30min"},"acoustic_properties":{"spectrum_adaptation_term":9.301444243932576,"weighted_sound_reduction_index":7.061401241503109},"air_tightness":0.3616076749251911,"vapor_permeability":0.20271230230023218},"material":{"finish_material":"Steel","structural_material":"Steel"},"ifc_type":"IfcWallStandardCase","name":"Cross-Laminated Timber Wall Panel","version_metadata":{"last_updated":"2000-01-23T04:56:07.000+00:00","version":"version","status":"draft"},"economic_factors":{"manufacturing_lead_time":21,"currency":"EUR","cost_per_unit":180.5}}

    headers = {
        "apiKey": "special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "POST",
    #    "/element",
    #    headers=headers,
    #    json=element_create,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_element(client: TestClient):
    """Test case for get_element

    Get an element
    """

    headers = {
        "apiKey": "special-key",
        "Authorization": "Bearer special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/element".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

