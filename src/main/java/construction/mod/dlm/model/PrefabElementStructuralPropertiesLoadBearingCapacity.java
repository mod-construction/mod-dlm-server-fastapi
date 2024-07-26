package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementStructuralPropertiesLoadBearingCapacity
 */

@JsonTypeName("PrefabElement_structuralProperties_loadBearingCapacity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementStructuralPropertiesLoadBearingCapacity {

  private BigDecimal maximumLoad;

  /**
   * Gets or Sets unit
   */
  public enum UnitEnum {
    N("N"),
    
    K_N("kN"),
    
    LBF("lbf"),
    
    KGF("kgf");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UnitEnum unit;

  private String loadDistribution;

  public PrefabElementStructuralPropertiesLoadBearingCapacity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementStructuralPropertiesLoadBearingCapacity(BigDecimal maximumLoad, UnitEnum unit, String loadDistribution) {
    this.maximumLoad = maximumLoad;
    this.unit = unit;
    this.loadDistribution = loadDistribution;
  }

  public PrefabElementStructuralPropertiesLoadBearingCapacity maximumLoad(BigDecimal maximumLoad) {
    this.maximumLoad = maximumLoad;
    return this;
  }

  /**
   * Get maximumLoad
   * @return maximumLoad
   */
  @NotNull @Valid 
  @Schema(name = "maximumLoad", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maximumLoad")
  public BigDecimal getMaximumLoad() {
    return maximumLoad;
  }

  public void setMaximumLoad(BigDecimal maximumLoad) {
    this.maximumLoad = maximumLoad;
  }

  public PrefabElementStructuralPropertiesLoadBearingCapacity unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @NotNull 
  @Schema(name = "unit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public PrefabElementStructuralPropertiesLoadBearingCapacity loadDistribution(String loadDistribution) {
    this.loadDistribution = loadDistribution;
    return this;
  }

  /**
   * Get loadDistribution
   * @return loadDistribution
   */
  @NotNull 
  @Schema(name = "loadDistribution", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("loadDistribution")
  public String getLoadDistribution() {
    return loadDistribution;
  }

  public void setLoadDistribution(String loadDistribution) {
    this.loadDistribution = loadDistribution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementStructuralPropertiesLoadBearingCapacity prefabElementStructuralPropertiesLoadBearingCapacity = (PrefabElementStructuralPropertiesLoadBearingCapacity) o;
    return Objects.equals(this.maximumLoad, prefabElementStructuralPropertiesLoadBearingCapacity.maximumLoad) &&
        Objects.equals(this.unit, prefabElementStructuralPropertiesLoadBearingCapacity.unit) &&
        Objects.equals(this.loadDistribution, prefabElementStructuralPropertiesLoadBearingCapacity.loadDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumLoad, unit, loadDistribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementStructuralPropertiesLoadBearingCapacity {\n");
    sb.append("    maximumLoad: ").append(toIndentedString(maximumLoad)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    loadDistribution: ").append(toIndentedString(loadDistribution)).append("\n");
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

