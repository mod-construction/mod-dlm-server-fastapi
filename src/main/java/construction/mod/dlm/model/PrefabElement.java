package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import construction.mod.dlm.model.PrefabElementAestheticAndCustomizationOptions;
import construction.mod.dlm.model.PrefabElementBoundingBox;
import construction.mod.dlm.model.PrefabElementDimensional;
import construction.mod.dlm.model.PrefabElementDocumentationAndCompliance;
import construction.mod.dlm.model.PrefabElementEconomicFactors;
import construction.mod.dlm.model.PrefabElementInstallationAndConnectivity;
import construction.mod.dlm.model.PrefabElementLifecycleAndMaintenance;
import construction.mod.dlm.model.PrefabElementMaterial;
import construction.mod.dlm.model.PrefabElementPerformance;
import construction.mod.dlm.model.PrefabElementStructuralProperties;
import construction.mod.dlm.model.PrefabElementSustainability;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Prefab Element
 */

@Schema(name = "PrefabElement", description = "Prefab Element")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElement {

  private UUID id;

  private String name;

  private String description;

  private PrefabElementBoundingBox boundingBox;

  @Valid
  private List<String> images = new ArrayList<>();

  /**
   * Gets or Sets buildingSystem
   */
  public enum BuildingSystemEnum {
    WALL("Wall"),
    
    BALCONY("Balcony"),
    
    POD("Pod"),
    
    FRAME("Frame"),
    
    FACADE("Facade"),
    
    FLOORS("Floors"),
    
    MODULES("Modules"),
    
    PLANTS("Plants"),
    
    ROOFS("Roofs"),
    
    STAIRS("Stairs");

    private String value;

    BuildingSystemEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BuildingSystemEnum fromValue(String value) {
      for (BuildingSystemEnum b : BuildingSystemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BuildingSystemEnum buildingSystem;

  /**
   * Gets or Sets productCategory
   */
  public enum ProductCategoryEnum {
    BOARDING("Boarding"),
    
    SOLID_WALL_PANELS("Solid Wall Panels"),
    
    CLOSED_WALL_PANELS("Closed Wall Panels"),
    
    TWINWALL("Twinwall"),
    
    OPEN_WALL_PANELS("Open Wall Panels"),
    
    STRUCTURAL_INSULATED_PANELS_SIPS_("Structural Insulated Panels (SIPs)"),
    
    INSULATED_CONCRETE_PANELS("Insulated Concrete Panels"),
    
    PREFABRICATED_BALCONY("Prefabricated Balcony"),
    
    POD("Pod"),
    
    WHOLE_BUILDING_SYSTEM("Whole Building System"),
    
    STRUCTURAL_FRAME("Structural Frame"),
    
    FACADE_SYSTEM("Facade System"),
    
    HOLLOWCORE_FLOOR("Hollowcore Floor"),
    
    CONCRETE_LATTICE_FLOOR("Concrete Lattice Floor"),
    
    FLOOR_CASSETTES("Floor Cassettes"),
    
    SOLID_FLOOR_PANELS("Solid Floor Panels"),
    
    VOLUMETRIC_MODULE("Volumetric module"),
    
    PREFABRICATED_PLANT("Prefabricated Plant"),
    
    ROOF_PANEL("Roof Panel"),
    
    ROOF_TRUSS("Roof Truss"),
    
    PREFABRICATED_STAIRS("Prefabricated Stairs");

    private String value;

    ProductCategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProductCategoryEnum fromValue(String value) {
      for (ProductCategoryEnum b : ProductCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProductCategoryEnum productCategory;

  private PrefabElementMaterial material;

  private PrefabElementDimensional dimensional;

  private PrefabElementStructuralProperties structuralProperties;

  private PrefabElementPerformance performance;

  private PrefabElementSustainability sustainability;

  private PrefabElementDocumentationAndCompliance documentationAndCompliance;

  private PrefabElementInstallationAndConnectivity installationAndConnectivity;

  private PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance;

  private PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions;

  private PrefabElementEconomicFactors economicFactors;

  public PrefabElement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElement(UUID id, String name, String description, PrefabElementBoundingBox boundingBox, List<String> images, BuildingSystemEnum buildingSystem, ProductCategoryEnum productCategory, PrefabElementMaterial material, PrefabElementDimensional dimensional) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.boundingBox = boundingBox;
    this.images = images;
    this.buildingSystem = buildingSystem;
    this.productCategory = productCategory;
    this.material = material;
    this.dimensional = dimensional;
  }

  public PrefabElement id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for an element
   * @return id
   */
  @NotNull @Valid 
  @Schema(name = "id", example = "4dd643ff-7ec7-4666-9c88-50b7d3da34e4", description = "A unique identifier for an element", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PrefabElement name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PrefabElement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @NotNull 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PrefabElement boundingBox(PrefabElementBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Get boundingBox
   * @return boundingBox
   */
  @NotNull @Valid 
  @Schema(name = "boundingBox", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boundingBox")
  public PrefabElementBoundingBox getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(PrefabElementBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }

  public PrefabElement images(List<String> images) {
    this.images = images;
    return this;
  }

  public PrefabElement addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   */
  @NotNull 
  @Schema(name = "images", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public PrefabElement buildingSystem(BuildingSystemEnum buildingSystem) {
    this.buildingSystem = buildingSystem;
    return this;
  }

  /**
   * Get buildingSystem
   * @return buildingSystem
   */
  @NotNull 
  @Schema(name = "buildingSystem", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("buildingSystem")
  public BuildingSystemEnum getBuildingSystem() {
    return buildingSystem;
  }

  public void setBuildingSystem(BuildingSystemEnum buildingSystem) {
    this.buildingSystem = buildingSystem;
  }

  public PrefabElement productCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
   */
  @NotNull 
  @Schema(name = "productCategory", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productCategory")
  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
  }

  public PrefabElement material(PrefabElementMaterial material) {
    this.material = material;
    return this;
  }

  /**
   * Get material
   * @return material
   */
  @NotNull @Valid 
  @Schema(name = "material", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("material")
  public PrefabElementMaterial getMaterial() {
    return material;
  }

  public void setMaterial(PrefabElementMaterial material) {
    this.material = material;
  }

  public PrefabElement dimensional(PrefabElementDimensional dimensional) {
    this.dimensional = dimensional;
    return this;
  }

  /**
   * Get dimensional
   * @return dimensional
   */
  @NotNull @Valid 
  @Schema(name = "dimensional", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dimensional")
  public PrefabElementDimensional getDimensional() {
    return dimensional;
  }

  public void setDimensional(PrefabElementDimensional dimensional) {
    this.dimensional = dimensional;
  }

  public PrefabElement structuralProperties(PrefabElementStructuralProperties structuralProperties) {
    this.structuralProperties = structuralProperties;
    return this;
  }

  /**
   * Get structuralProperties
   * @return structuralProperties
   */
  @Valid 
  @Schema(name = "structuralProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("structuralProperties")
  public PrefabElementStructuralProperties getStructuralProperties() {
    return structuralProperties;
  }

  public void setStructuralProperties(PrefabElementStructuralProperties structuralProperties) {
    this.structuralProperties = structuralProperties;
  }

  public PrefabElement performance(PrefabElementPerformance performance) {
    this.performance = performance;
    return this;
  }

  /**
   * Get performance
   * @return performance
   */
  @Valid 
  @Schema(name = "performance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performance")
  public PrefabElementPerformance getPerformance() {
    return performance;
  }

  public void setPerformance(PrefabElementPerformance performance) {
    this.performance = performance;
  }

  public PrefabElement sustainability(PrefabElementSustainability sustainability) {
    this.sustainability = sustainability;
    return this;
  }

  /**
   * Get sustainability
   * @return sustainability
   */
  @Valid 
  @Schema(name = "sustainability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sustainability")
  public PrefabElementSustainability getSustainability() {
    return sustainability;
  }

  public void setSustainability(PrefabElementSustainability sustainability) {
    this.sustainability = sustainability;
  }

  public PrefabElement documentationAndCompliance(PrefabElementDocumentationAndCompliance documentationAndCompliance) {
    this.documentationAndCompliance = documentationAndCompliance;
    return this;
  }

  /**
   * Get documentationAndCompliance
   * @return documentationAndCompliance
   */
  @Valid 
  @Schema(name = "documentationAndCompliance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentationAndCompliance")
  public PrefabElementDocumentationAndCompliance getDocumentationAndCompliance() {
    return documentationAndCompliance;
  }

  public void setDocumentationAndCompliance(PrefabElementDocumentationAndCompliance documentationAndCompliance) {
    this.documentationAndCompliance = documentationAndCompliance;
  }

  public PrefabElement installationAndConnectivity(PrefabElementInstallationAndConnectivity installationAndConnectivity) {
    this.installationAndConnectivity = installationAndConnectivity;
    return this;
  }

  /**
   * Get installationAndConnectivity
   * @return installationAndConnectivity
   */
  @Valid 
  @Schema(name = "installationAndConnectivity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("installationAndConnectivity")
  public PrefabElementInstallationAndConnectivity getInstallationAndConnectivity() {
    return installationAndConnectivity;
  }

  public void setInstallationAndConnectivity(PrefabElementInstallationAndConnectivity installationAndConnectivity) {
    this.installationAndConnectivity = installationAndConnectivity;
  }

  public PrefabElement lifecycleAndMaintenance(PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance) {
    this.lifecycleAndMaintenance = lifecycleAndMaintenance;
    return this;
  }

  /**
   * Get lifecycleAndMaintenance
   * @return lifecycleAndMaintenance
   */
  @Valid 
  @Schema(name = "lifecycleAndMaintenance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycleAndMaintenance")
  public PrefabElementLifecycleAndMaintenance getLifecycleAndMaintenance() {
    return lifecycleAndMaintenance;
  }

  public void setLifecycleAndMaintenance(PrefabElementLifecycleAndMaintenance lifecycleAndMaintenance) {
    this.lifecycleAndMaintenance = lifecycleAndMaintenance;
  }

  public PrefabElement aestheticAndCustomizationOptions(PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions) {
    this.aestheticAndCustomizationOptions = aestheticAndCustomizationOptions;
    return this;
  }

  /**
   * Get aestheticAndCustomizationOptions
   * @return aestheticAndCustomizationOptions
   */
  @Valid 
  @Schema(name = "aestheticAndCustomizationOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aestheticAndCustomizationOptions")
  public PrefabElementAestheticAndCustomizationOptions getAestheticAndCustomizationOptions() {
    return aestheticAndCustomizationOptions;
  }

  public void setAestheticAndCustomizationOptions(PrefabElementAestheticAndCustomizationOptions aestheticAndCustomizationOptions) {
    this.aestheticAndCustomizationOptions = aestheticAndCustomizationOptions;
  }

  public PrefabElement economicFactors(PrefabElementEconomicFactors economicFactors) {
    this.economicFactors = economicFactors;
    return this;
  }

  /**
   * Get economicFactors
   * @return economicFactors
   */
  @Valid 
  @Schema(name = "economicFactors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("economicFactors")
  public PrefabElementEconomicFactors getEconomicFactors() {
    return economicFactors;
  }

  public void setEconomicFactors(PrefabElementEconomicFactors economicFactors) {
    this.economicFactors = economicFactors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElement prefabElement = (PrefabElement) o;
    return Objects.equals(this.id, prefabElement.id) &&
        Objects.equals(this.name, prefabElement.name) &&
        Objects.equals(this.description, prefabElement.description) &&
        Objects.equals(this.boundingBox, prefabElement.boundingBox) &&
        Objects.equals(this.images, prefabElement.images) &&
        Objects.equals(this.buildingSystem, prefabElement.buildingSystem) &&
        Objects.equals(this.productCategory, prefabElement.productCategory) &&
        Objects.equals(this.material, prefabElement.material) &&
        Objects.equals(this.dimensional, prefabElement.dimensional) &&
        Objects.equals(this.structuralProperties, prefabElement.structuralProperties) &&
        Objects.equals(this.performance, prefabElement.performance) &&
        Objects.equals(this.sustainability, prefabElement.sustainability) &&
        Objects.equals(this.documentationAndCompliance, prefabElement.documentationAndCompliance) &&
        Objects.equals(this.installationAndConnectivity, prefabElement.installationAndConnectivity) &&
        Objects.equals(this.lifecycleAndMaintenance, prefabElement.lifecycleAndMaintenance) &&
        Objects.equals(this.aestheticAndCustomizationOptions, prefabElement.aestheticAndCustomizationOptions) &&
        Objects.equals(this.economicFactors, prefabElement.economicFactors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, boundingBox, images, buildingSystem, productCategory, material, dimensional, structuralProperties, performance, sustainability, documentationAndCompliance, installationAndConnectivity, lifecycleAndMaintenance, aestheticAndCustomizationOptions, economicFactors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    buildingSystem: ").append(toIndentedString(buildingSystem)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    dimensional: ").append(toIndentedString(dimensional)).append("\n");
    sb.append("    structuralProperties: ").append(toIndentedString(structuralProperties)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    sustainability: ").append(toIndentedString(sustainability)).append("\n");
    sb.append("    documentationAndCompliance: ").append(toIndentedString(documentationAndCompliance)).append("\n");
    sb.append("    installationAndConnectivity: ").append(toIndentedString(installationAndConnectivity)).append("\n");
    sb.append("    lifecycleAndMaintenance: ").append(toIndentedString(lifecycleAndMaintenance)).append("\n");
    sb.append("    aestheticAndCustomizationOptions: ").append(toIndentedString(aestheticAndCustomizationOptions)).append("\n");
    sb.append("    economicFactors: ").append(toIndentedString(economicFactors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

