# coding: utf-8

from fastapi.testclient import TestClient


from mod_dlm_server.models.element_create import ElementCreate  # noqa: F401
from mod_dlm_server.models.prefab_element import PrefabElement  # noqa: F401


def test_create_element(client: TestClient):
    """Test case for create_element

    Create a new element
    """
    element_create = {"bounding_box":{"depth":1.4658129805029452,"width":0.8008281904610115,"height":6.027456183070403},"images":["images","images"],"installation_and_connectivity":{"installation_time":"installationTime","connection_type":"Bolt-on","compatibility":"Steel Frame"},"building_system":"Wall","dimensional":{"width":{"min":5.962133916683182,"max":5.637376656633329},"length":{"min":5.962133916683182,"max":5.637376656633329},"height":{"min":5.962133916683182,"max":5.637376656633329}},"structural_properties":{"wind_load_resistance":"Class A","load_bearing_capacity":{"unit":"N","load_distribution":"loadDistribution","maximum_load":2.3021358869347655},"seismic_resistance":"Zone 1"},"lifecycle_and_maintenance":{"maintenance_requirements":"maintenanceRequirements","warranty":"warranty","expected_lifespan":"expectedLifespan"},"description":"description","documentation_and_compliance":{"technical_specifications":"technicalSpecifications","certifications":{"certification_types":["certificationTypes","certificationTypes"],"regulatory_approvals":["regulatoryApprovals","regulatoryApprovals"]}},"sustainability":{"country_of_manufacturing":"countryOfManufacturing","recyclability":"0%","classification":"A+","energy_efficiency":"R-1","voc_emissions":"None"},"product_category":"Boarding","aesthetic_and_customization_options":{"color_options":["colorOptions","colorOptions"],"texture":"texture","modular_adaptability":"modularAdaptability"},"performance":{"thermal_transmittance":1.4122802483006218,"acoustic_properties":{"acoustic_performance":"acousticPerformance","sound_insulation_rating":"soundInsulationRating"},"resistance_to_fire_classification":"A1"},"material":{"finish_material":"Timber","structural_material":"Timber"},"name":"name","economic_factors":{"manufacturing_lead_time":"manufacturingLeadTime","cost_per_unit":9.301444243932576}}

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

