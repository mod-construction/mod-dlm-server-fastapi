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
 * The bounding box of an element in millimeters.
 */

@Schema(name = "PrefabElement_boundingBox", description = "The bounding box of an element in millimeters.")
@JsonTypeName("PrefabElement_boundingBox")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementBoundingBox {

  private BigDecimal width;

  private BigDecimal height;

  private BigDecimal depth;

  public PrefabElementBoundingBox() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementBoundingBox(BigDecimal width, BigDecimal height, BigDecimal depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public PrefabElementBoundingBox width(BigDecimal width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   */
  @NotNull @Valid 
  @Schema(name = "width", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("width")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public PrefabElementBoundingBox height(BigDecimal height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
   */
  @NotNull @Valid 
  @Schema(name = "height", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public PrefabElementBoundingBox depth(BigDecimal depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
   */
  @NotNull @Valid 
  @Schema(name = "depth", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("depth")
  public BigDecimal getDepth() {
    return depth;
  }

  public void setDepth(BigDecimal depth) {
    this.depth = depth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementBoundingBox prefabElementBoundingBox = (PrefabElementBoundingBox) o;
    return Objects.equals(this.width, prefabElementBoundingBox.width) &&
        Objects.equals(this.height, prefabElementBoundingBox.height) &&
        Objects.equals(this.depth, prefabElementBoundingBox.depth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, depth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementBoundingBox {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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

