/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ElementCreate;
import org.openapitools.model.PrefabElement;
import java.util.UUID;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:18.847807705Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
@Validated
@Tag(name = "element", description = "the element API")
public interface ElementApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /element : Create a new element
     * Creates a new element in the database.
     *
     * @param elementCreate The element to create. (optional)
     * @return The element was created successfully. (status code 201)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     */
    @Operation(
        operationId = "createElement",
        summary = "Create a new element",
        description = "Creates a new element in the database.",
        responses = {
            @ApiResponse(responseCode = "201", description = "The element was created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PrefabElement.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request."),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid.")
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/element",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<PrefabElement> createElement(
        @Parameter(name = "ElementCreate", description = "The element to create.") @Valid @RequestBody(required = false) ElementCreate elementCreate
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"boundingBox\" : { \"depth\" : 1.4658129805029452, \"width\" : 0.8008281904610115, \"height\" : 6.027456183070403 }, \"images\" : [ \"images\", \"images\" ], \"installationAndConnectivity\" : { \"installationTime\" : \"installationTime\", \"connectionType\" : \"Bolt-on\", \"compatibility\" : \"Steel Frame\" }, \"buildingSystem\" : \"Wall\", \"dimensional\" : { \"width\" : { \"min\" : 5.962133916683182, \"max\" : 5.637376656633329 }, \"length\" : { \"min\" : 5.962133916683182, \"max\" : 5.637376656633329 }, \"height\" : { \"min\" : 5.962133916683182, \"max\" : 5.637376656633329 } }, \"structuralProperties\" : { \"windLoadResistance\" : \"Class A\", \"loadBearingCapacity\" : { \"unit\" : \"N\", \"loadDistribution\" : \"loadDistribution\", \"maximumLoad\" : 2.3021358869347655 }, \"seismicResistance\" : \"Zone 1\" }, \"lifecycleAndMaintenance\" : { \"maintenanceRequirements\" : \"maintenanceRequirements\", \"warranty\" : \"warranty\", \"expectedLifespan\" : \"expectedLifespan\" }, \"description\" : \"description\", \"documentationAndCompliance\" : { \"technicalSpecifications\" : \"technicalSpecifications\", \"certifications\" : { \"certificationTypes\" : [ \"certificationTypes\", \"certificationTypes\" ], \"regulatoryApprovals\" : [ \"regulatoryApprovals\", \"regulatoryApprovals\" ] } }, \"sustainability\" : { \"countryOfManufacturing\" : \"countryOfManufacturing\", \"recyclability\" : \"0%\", \"classification\" : \"A+\", \"energyEfficiency\" : \"R-1\", \"VOCEmissions\" : \"None\" }, \"productCategory\" : \"Boarding\", \"aestheticAndCustomizationOptions\" : { \"colorOptions\" : [ \"colorOptions\", \"colorOptions\" ], \"texture\" : \"texture\", \"modularAdaptability\" : \"modularAdaptability\" }, \"performance\" : { \"thermalTransmittance\" : 1.4122802483006218, \"acousticProperties\" : { \"acousticPerformance\" : \"acousticPerformance\", \"soundInsulationRating\" : \"soundInsulationRating\" }, \"resistanceToFireClassification\" : \"A1\" }, \"material\" : { \"finishMaterial\" : \"Timber\", \"structuralMaterial\" : \"Timber\" }, \"name\" : \"name\", \"id\" : \"4dd643ff-7ec7-4666-9c88-50b7d3da34e4\", \"economicFactors\" : { \"manufacturingLeadTime\" : \"manufacturingLeadTime\", \"costPerUnit\" : 9.301444243932576 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /element : Get an element
     * Gets an element from the database.
     *
     * @param id A unique identifier for an element (required)
     * @return The element was retrieved successfully. (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or An element with the specified ID was not found. (status code 404)
     */
    @Operation(
        operationId = "getElement",
        summary = "Get an element",
        description = "Gets an element from the database.",
        responses = {
            @ApiResponse(responseCode = "200", description = "The element was retrieved successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PrefabElement.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request."),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid."),
            @ApiResponse(responseCode = "404", description = "An element with the specified ID was not found.")
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/element",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PrefabElement> getElement(
        @Parameter(name = "id", description = "A unique identifier for an element", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"boundingBox\" : { \"depth\" : 1.4658129805029452, \"width\" : 0.8008281904610115, \"height\" : 6.027456183070403 }, \"images\" : [ \"images\", \"images\" ], \"installationAndConnectivity\" : { \"installationTime\" : \"installationTime\", \"connectionType\" : \"Bolt-on\", \"compatibility\" : \"Steel Frame\" }, \"buildingSystem\" : \"Wall\", \"dimensional\" : { \"width\" : { \"min\" : 5.962133916683182, \"max\" : 5.637376656633329 }, \"length\" : { \"min\" : 5.962133916683182, \"max\" : 5.637376656633329 }, \"height\" : { \"min\" : 5.962133916683182, \"max\" : 5.637376656633329 } }, \"structuralProperties\" : { \"windLoadResistance\" : \"Class A\", \"loadBearingCapacity\" : { \"unit\" : \"N\", \"loadDistribution\" : \"loadDistribution\", \"maximumLoad\" : 2.3021358869347655 }, \"seismicResistance\" : \"Zone 1\" }, \"lifecycleAndMaintenance\" : { \"maintenanceRequirements\" : \"maintenanceRequirements\", \"warranty\" : \"warranty\", \"expectedLifespan\" : \"expectedLifespan\" }, \"description\" : \"description\", \"documentationAndCompliance\" : { \"technicalSpecifications\" : \"technicalSpecifications\", \"certifications\" : { \"certificationTypes\" : [ \"certificationTypes\", \"certificationTypes\" ], \"regulatoryApprovals\" : [ \"regulatoryApprovals\", \"regulatoryApprovals\" ] } }, \"sustainability\" : { \"countryOfManufacturing\" : \"countryOfManufacturing\", \"recyclability\" : \"0%\", \"classification\" : \"A+\", \"energyEfficiency\" : \"R-1\", \"VOCEmissions\" : \"None\" }, \"productCategory\" : \"Boarding\", \"aestheticAndCustomizationOptions\" : { \"colorOptions\" : [ \"colorOptions\", \"colorOptions\" ], \"texture\" : \"texture\", \"modularAdaptability\" : \"modularAdaptability\" }, \"performance\" : { \"thermalTransmittance\" : 1.4122802483006218, \"acousticProperties\" : { \"acousticPerformance\" : \"acousticPerformance\", \"soundInsulationRating\" : \"soundInsulationRating\" }, \"resistanceToFireClassification\" : \"A1\" }, \"material\" : { \"finishMaterial\" : \"Timber\", \"structuralMaterial\" : \"Timber\" }, \"name\" : \"name\", \"id\" : \"4dd643ff-7ec7-4666-9c88-50b7d3da34e4\", \"economicFactors\" : { \"manufacturingLeadTime\" : \"manufacturingLeadTime\", \"costPerUnit\" : 9.301444243932576 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
