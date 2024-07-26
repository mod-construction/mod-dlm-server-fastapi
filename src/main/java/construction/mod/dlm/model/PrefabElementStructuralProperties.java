package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import construction.mod.dlm.model.PrefabElementStructuralPropertiesLoadBearingCapacity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementStructuralProperties
 */

@JsonTypeName("PrefabElement_structuralProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementStructuralProperties {

  private PrefabElementStructuralPropertiesLoadBearingCapacity loadBearingCapacity;

  /**
   * Gets or Sets seismicResistance
   */
  public enum SeismicResistanceEnum {
    _1("Zone 1"),
    
    _2("Zone 2"),
    
    _3("Zone 3"),
    
    _4("Zone 4");

    private String value;

    SeismicResistanceEnum(String value) {
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
    public static SeismicResistanceEnum fromValue(String value) {
      for (SeismicResistanceEnum b : SeismicResistanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SeismicResistanceEnum seismicResistance;

  /**
   * Gets or Sets windLoadResistance
   */
  public enum WindLoadResistanceEnum {
    A("Class A"),
    
    B("Class B"),
    
    C("Class C"),
    
    D("Class D");

    private String value;

    WindLoadResistanceEnum(String value) {
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
    public static WindLoadResistanceEnum fromValue(String value) {
      for (WindLoadResistanceEnum b : WindLoadResistanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private WindLoadResistanceEnum windLoadResistance;

  public PrefabElementStructuralProperties loadBearingCapacity(PrefabElementStructuralPropertiesLoadBearingCapacity loadBearingCapacity) {
    this.loadBearingCapacity = loadBearingCapacity;
    return this;
  }

  /**
   * Get loadBearingCapacity
   * @return loadBearingCapacity
   */
  @Valid 
  @Schema(name = "loadBearingCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loadBearingCapacity")
  public PrefabElementStructuralPropertiesLoadBearingCapacity getLoadBearingCapacity() {
    return loadBearingCapacity;
  }

  public void setLoadBearingCapacity(PrefabElementStructuralPropertiesLoadBearingCapacity loadBearingCapacity) {
    this.loadBearingCapacity = loadBearingCapacity;
  }

  public PrefabElementStructuralProperties seismicResistance(SeismicResistanceEnum seismicResistance) {
    this.seismicResistance = seismicResistance;
    return this;
  }

  /**
   * Get seismicResistance
   * @return seismicResistance
   */
  
  @Schema(name = "seismicResistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seismicResistance")
  public SeismicResistanceEnum getSeismicResistance() {
    return seismicResistance;
  }

  public void setSeismicResistance(SeismicResistanceEnum seismicResistance) {
    this.seismicResistance = seismicResistance;
  }

  public PrefabElementStructuralProperties windLoadResistance(WindLoadResistanceEnum windLoadResistance) {
    this.windLoadResistance = windLoadResistance;
    return this;
  }

  /**
   * Get windLoadResistance
   * @return windLoadResistance
   */
  
  @Schema(name = "windLoadResistance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windLoadResistance")
  public WindLoadResistanceEnum getWindLoadResistance() {
    return windLoadResistance;
  }

  public void setWindLoadResistance(WindLoadResistanceEnum windLoadResistance) {
    this.windLoadResistance = windLoadResistance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementStructuralProperties prefabElementStructuralProperties = (PrefabElementStructuralProperties) o;
    return Objects.equals(this.loadBearingCapacity, prefabElementStructuralProperties.loadBearingCapacity) &&
        Objects.equals(this.seismicResistance, prefabElementStructuralProperties.seismicResistance) &&
        Objects.equals(this.windLoadResistance, prefabElementStructuralProperties.windLoadResistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBearingCapacity, seismicResistance, windLoadResistance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementStructuralProperties {\n");
    sb.append("    loadBearingCapacity: ").append(toIndentedString(loadBearingCapacity)).append("\n");
    sb.append("    seismicResistance: ").append(toIndentedString(seismicResistance)).append("\n");
    sb.append("    windLoadResistance: ").append(toIndentedString(windLoadResistance)).append("\n");
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

