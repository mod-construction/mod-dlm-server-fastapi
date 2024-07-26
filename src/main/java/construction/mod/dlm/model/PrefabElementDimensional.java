package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import construction.mod.dlm.model.PrefabElementDimensionalWidth;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementDimensional
 */

@JsonTypeName("PrefabElement_dimensional")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementDimensional {

  private PrefabElementDimensionalWidth width;

  private PrefabElementDimensionalWidth height;

  private PrefabElementDimensionalWidth length;

  public PrefabElementDimensional() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementDimensional(PrefabElementDimensionalWidth width, PrefabElementDimensionalWidth height, PrefabElementDimensionalWidth length) {
    this.width = width;
    this.height = height;
    this.length = length;
  }

  public PrefabElementDimensional width(PrefabElementDimensionalWidth width) {
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
  public PrefabElementDimensionalWidth getWidth() {
    return width;
  }

  public void setWidth(PrefabElementDimensionalWidth width) {
    this.width = width;
  }

  public PrefabElementDimensional height(PrefabElementDimensionalWidth height) {
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
  public PrefabElementDimensionalWidth getHeight() {
    return height;
  }

  public void setHeight(PrefabElementDimensionalWidth height) {
    this.height = height;
  }

  public PrefabElementDimensional length(PrefabElementDimensionalWidth length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
   */
  @NotNull @Valid 
  @Schema(name = "length", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("length")
  public PrefabElementDimensionalWidth getLength() {
    return length;
  }

  public void setLength(PrefabElementDimensionalWidth length) {
    this.length = length;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementDimensional prefabElementDimensional = (PrefabElementDimensional) o;
    return Objects.equals(this.width, prefabElementDimensional.width) &&
        Objects.equals(this.height, prefabElementDimensional.height) &&
        Objects.equals(this.length, prefabElementDimensional.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementDimensional {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

