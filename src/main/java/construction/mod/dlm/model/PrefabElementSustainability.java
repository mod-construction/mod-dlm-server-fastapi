package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementSustainability
 */

@JsonTypeName("PrefabElement_sustainability")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementSustainability {

  private String countryOfManufacturing;

  /**
   * Gets or Sets classification
   */
  public enum ClassificationEnum {
    A_("A+"),
    
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D");

    private String value;

    ClassificationEnum(String value) {
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
    public static ClassificationEnum fromValue(String value) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ClassificationEnum classification;

  /**
   * Gets or Sets voCEmissions
   */
  public enum VoCEmissionsEnum {
    NONE("None"),
    
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High");

    private String value;

    VoCEmissionsEnum(String value) {
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
    public static VoCEmissionsEnum fromValue(String value) {
      for (VoCEmissionsEnum b : VoCEmissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VoCEmissionsEnum voCEmissions;

  /**
   * Gets or Sets recyclability
   */
  public enum RecyclabilityEnum {
    _0_("0%"),
    
    _25_("25%"),
    
    _50_("50%"),
    
    _75_("75%"),
    
    _100_("100%");

    private String value;

    RecyclabilityEnum(String value) {
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
    public static RecyclabilityEnum fromValue(String value) {
      for (RecyclabilityEnum b : RecyclabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RecyclabilityEnum recyclability;

  /**
   * Gets or Sets energyEfficiency
   */
  public enum EnergyEfficiencyEnum {
    R_1("R-1"),
    
    R_2("R-2"),
    
    R_5("R-5"),
    
    ENERGY_STAR("Energy Star"),
    
    LEED_CERTIFIED("LEED Certified"),
    
    LEED_SILVER("LEED Silver"),
    
    LEED_GOLD("LEED Gold"),
    
    LEED_PLATINUM("LEED Platinum");

    private String value;

    EnergyEfficiencyEnum(String value) {
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
    public static EnergyEfficiencyEnum fromValue(String value) {
      for (EnergyEfficiencyEnum b : EnergyEfficiencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EnergyEfficiencyEnum energyEfficiency;

  public PrefabElementSustainability() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementSustainability(String countryOfManufacturing, ClassificationEnum classification) {
    this.countryOfManufacturing = countryOfManufacturing;
    this.classification = classification;
  }

  public PrefabElementSustainability countryOfManufacturing(String countryOfManufacturing) {
    this.countryOfManufacturing = countryOfManufacturing;
    return this;
  }

  /**
   * Get countryOfManufacturing
   * @return countryOfManufacturing
   */
  @NotNull 
  @Schema(name = "countryOfManufacturing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryOfManufacturing")
  public String getCountryOfManufacturing() {
    return countryOfManufacturing;
  }

  public void setCountryOfManufacturing(String countryOfManufacturing) {
    this.countryOfManufacturing = countryOfManufacturing;
  }

  public PrefabElementSustainability classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
   */
  @NotNull 
  @Schema(name = "classification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("classification")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public PrefabElementSustainability voCEmissions(VoCEmissionsEnum voCEmissions) {
    this.voCEmissions = voCEmissions;
    return this;
  }

  /**
   * Get voCEmissions
   * @return voCEmissions
   */
  
  @Schema(name = "VOCEmissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VOCEmissions")
  public VoCEmissionsEnum getVoCEmissions() {
    return voCEmissions;
  }

  public void setVoCEmissions(VoCEmissionsEnum voCEmissions) {
    this.voCEmissions = voCEmissions;
  }

  public PrefabElementSustainability recyclability(RecyclabilityEnum recyclability) {
    this.recyclability = recyclability;
    return this;
  }

  /**
   * Get recyclability
   * @return recyclability
   */
  
  @Schema(name = "recyclability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recyclability")
  public RecyclabilityEnum getRecyclability() {
    return recyclability;
  }

  public void setRecyclability(RecyclabilityEnum recyclability) {
    this.recyclability = recyclability;
  }

  public PrefabElementSustainability energyEfficiency(EnergyEfficiencyEnum energyEfficiency) {
    this.energyEfficiency = energyEfficiency;
    return this;
  }

  /**
   * Get energyEfficiency
   * @return energyEfficiency
   */
  
  @Schema(name = "energyEfficiency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("energyEfficiency")
  public EnergyEfficiencyEnum getEnergyEfficiency() {
    return energyEfficiency;
  }

  public void setEnergyEfficiency(EnergyEfficiencyEnum energyEfficiency) {
    this.energyEfficiency = energyEfficiency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementSustainability prefabElementSustainability = (PrefabElementSustainability) o;
    return Objects.equals(this.countryOfManufacturing, prefabElementSustainability.countryOfManufacturing) &&
        Objects.equals(this.classification, prefabElementSustainability.classification) &&
        Objects.equals(this.voCEmissions, prefabElementSustainability.voCEmissions) &&
        Objects.equals(this.recyclability, prefabElementSustainability.recyclability) &&
        Objects.equals(this.energyEfficiency, prefabElementSustainability.energyEfficiency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfManufacturing, classification, voCEmissions, recyclability, energyEfficiency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementSustainability {\n");
    sb.append("    countryOfManufacturing: ").append(toIndentedString(countryOfManufacturing)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    voCEmissions: ").append(toIndentedString(voCEmissions)).append("\n");
    sb.append("    recyclability: ").append(toIndentedString(recyclability)).append("\n");
    sb.append("    energyEfficiency: ").append(toIndentedString(energyEfficiency)).append("\n");
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

