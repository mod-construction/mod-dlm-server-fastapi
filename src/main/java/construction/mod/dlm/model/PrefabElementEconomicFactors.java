package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementEconomicFactors
 */

@JsonTypeName("PrefabElement_economicFactors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementEconomicFactors {

  private BigDecimal costPerUnit;

  private String manufacturingLeadTime;

  public PrefabElementEconomicFactors costPerUnit(BigDecimal costPerUnit) {
    this.costPerUnit = costPerUnit;
    return this;
  }

  /**
   * Get costPerUnit
   * @return costPerUnit
   */
  @Valid 
  @Schema(name = "costPerUnit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costPerUnit")
  public BigDecimal getCostPerUnit() {
    return costPerUnit;
  }

  public void setCostPerUnit(BigDecimal costPerUnit) {
    this.costPerUnit = costPerUnit;
  }

  public PrefabElementEconomicFactors manufacturingLeadTime(String manufacturingLeadTime) {
    this.manufacturingLeadTime = manufacturingLeadTime;
    return this;
  }

  /**
   * Get manufacturingLeadTime
   * @return manufacturingLeadTime
   */
  
  @Schema(name = "manufacturingLeadTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufacturingLeadTime")
  public String getManufacturingLeadTime() {
    return manufacturingLeadTime;
  }

  public void setManufacturingLeadTime(String manufacturingLeadTime) {
    this.manufacturingLeadTime = manufacturingLeadTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementEconomicFactors prefabElementEconomicFactors = (PrefabElementEconomicFactors) o;
    return Objects.equals(this.costPerUnit, prefabElementEconomicFactors.costPerUnit) &&
        Objects.equals(this.manufacturingLeadTime, prefabElementEconomicFactors.manufacturingLeadTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costPerUnit, manufacturingLeadTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementEconomicFactors {\n");
    sb.append("    costPerUnit: ").append(toIndentedString(costPerUnit)).append("\n");
    sb.append("    manufacturingLeadTime: ").append(toIndentedString(manufacturingLeadTime)).append("\n");
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

