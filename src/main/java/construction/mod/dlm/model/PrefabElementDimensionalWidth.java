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
 * PrefabElementDimensionalWidth
 */

@JsonTypeName("PrefabElement_dimensional_width")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementDimensionalWidth {

  private BigDecimal min;

  private BigDecimal max;

  public PrefabElementDimensionalWidth() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementDimensionalWidth(BigDecimal min, BigDecimal max) {
    this.min = min;
    this.max = max;
  }

  public PrefabElementDimensionalWidth min(BigDecimal min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
   */
  @NotNull @Valid 
  @Schema(name = "min", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }

  public void setMin(BigDecimal min) {
    this.min = min;
  }

  public PrefabElementDimensionalWidth max(BigDecimal max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
   */
  @NotNull @Valid 
  @Schema(name = "max", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }

  public void setMax(BigDecimal max) {
    this.max = max;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementDimensionalWidth prefabElementDimensionalWidth = (PrefabElementDimensionalWidth) o;
    return Objects.equals(this.min, prefabElementDimensionalWidth.min) &&
        Objects.equals(this.max, prefabElementDimensionalWidth.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementDimensionalWidth {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

