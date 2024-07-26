package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import construction.mod.dlm.model.PrefabElementPerformanceAcousticProperties;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementPerformance
 */

@JsonTypeName("PrefabElement_performance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementPerformance {

  /**
   * Gets or Sets resistanceToFireClassification
   */
  public enum ResistanceToFireClassificationEnum {
    A1("A1"),
    
    A2("A2"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F"),
    
    _1_HOUR("1-hour"),
    
    _2_HOUR("2-hour"),
    
    _3_HOUR("3-hour"),
    
    _4_HOUR("4-hour");

    private String value;

    ResistanceToFireClassificationEnum(String value) {
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
    public static ResistanceToFireClassificationEnum fromValue(String value) {
      for (ResistanceToFireClassificationEnum b : ResistanceToFireClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResistanceToFireClassificationEnum resistanceToFireClassification;

  private BigDecimal thermalTransmittance;

  private PrefabElementPerformanceAcousticProperties acousticProperties;

  public PrefabElementPerformance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementPerformance(ResistanceToFireClassificationEnum resistanceToFireClassification, BigDecimal thermalTransmittance) {
    this.resistanceToFireClassification = resistanceToFireClassification;
    this.thermalTransmittance = thermalTransmittance;
  }

  public PrefabElementPerformance resistanceToFireClassification(ResistanceToFireClassificationEnum resistanceToFireClassification) {
    this.resistanceToFireClassification = resistanceToFireClassification;
    return this;
  }

  /**
   * Get resistanceToFireClassification
   * @return resistanceToFireClassification
   */
  @NotNull 
  @Schema(name = "resistanceToFireClassification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resistanceToFireClassification")
  public ResistanceToFireClassificationEnum getResistanceToFireClassification() {
    return resistanceToFireClassification;
  }

  public void setResistanceToFireClassification(ResistanceToFireClassificationEnum resistanceToFireClassification) {
    this.resistanceToFireClassification = resistanceToFireClassification;
  }

  public PrefabElementPerformance thermalTransmittance(BigDecimal thermalTransmittance) {
    this.thermalTransmittance = thermalTransmittance;
    return this;
  }

  /**
   * Get thermalTransmittance
   * minimum: 0
   * maximum: 2
   * @return thermalTransmittance
   */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("2") 
  @Schema(name = "thermalTransmittance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("thermalTransmittance")
  public BigDecimal getThermalTransmittance() {
    return thermalTransmittance;
  }

  public void setThermalTransmittance(BigDecimal thermalTransmittance) {
    this.thermalTransmittance = thermalTransmittance;
  }

  public PrefabElementPerformance acousticProperties(PrefabElementPerformanceAcousticProperties acousticProperties) {
    this.acousticProperties = acousticProperties;
    return this;
  }

  /**
   * Get acousticProperties
   * @return acousticProperties
   */
  @Valid 
  @Schema(name = "acousticProperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acousticProperties")
  public PrefabElementPerformanceAcousticProperties getAcousticProperties() {
    return acousticProperties;
  }

  public void setAcousticProperties(PrefabElementPerformanceAcousticProperties acousticProperties) {
    this.acousticProperties = acousticProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementPerformance prefabElementPerformance = (PrefabElementPerformance) o;
    return Objects.equals(this.resistanceToFireClassification, prefabElementPerformance.resistanceToFireClassification) &&
        Objects.equals(this.thermalTransmittance, prefabElementPerformance.thermalTransmittance) &&
        Objects.equals(this.acousticProperties, prefabElementPerformance.acousticProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resistanceToFireClassification, thermalTransmittance, acousticProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementPerformance {\n");
    sb.append("    resistanceToFireClassification: ").append(toIndentedString(resistanceToFireClassification)).append("\n");
    sb.append("    thermalTransmittance: ").append(toIndentedString(thermalTransmittance)).append("\n");
    sb.append("    acousticProperties: ").append(toIndentedString(acousticProperties)).append("\n");
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

