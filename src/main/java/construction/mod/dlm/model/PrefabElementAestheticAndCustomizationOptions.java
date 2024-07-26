package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementAestheticAndCustomizationOptions
 */

@JsonTypeName("PrefabElement_aestheticAndCustomizationOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementAestheticAndCustomizationOptions {

  @Valid
  private List<String> colorOptions = new ArrayList<>();

  private String texture;

  private String modularAdaptability;

  public PrefabElementAestheticAndCustomizationOptions colorOptions(List<String> colorOptions) {
    this.colorOptions = colorOptions;
    return this;
  }

  public PrefabElementAestheticAndCustomizationOptions addColorOptionsItem(String colorOptionsItem) {
    if (this.colorOptions == null) {
      this.colorOptions = new ArrayList<>();
    }
    this.colorOptions.add(colorOptionsItem);
    return this;
  }

  /**
   * Get colorOptions
   * @return colorOptions
   */
  
  @Schema(name = "colorOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colorOptions")
  public List<String> getColorOptions() {
    return colorOptions;
  }

  public void setColorOptions(List<String> colorOptions) {
    this.colorOptions = colorOptions;
  }

  public PrefabElementAestheticAndCustomizationOptions texture(String texture) {
    this.texture = texture;
    return this;
  }

  /**
   * Get texture
   * @return texture
   */
  
  @Schema(name = "texture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("texture")
  public String getTexture() {
    return texture;
  }

  public void setTexture(String texture) {
    this.texture = texture;
  }

  public PrefabElementAestheticAndCustomizationOptions modularAdaptability(String modularAdaptability) {
    this.modularAdaptability = modularAdaptability;
    return this;
  }

  /**
   * Get modularAdaptability
   * @return modularAdaptability
   */
  
  @Schema(name = "modularAdaptability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modularAdaptability")
  public String getModularAdaptability() {
    return modularAdaptability;
  }

  public void setModularAdaptability(String modularAdaptability) {
    this.modularAdaptability = modularAdaptability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementAestheticAndCustomizationOptions prefabElementAestheticAndCustomizationOptions = (PrefabElementAestheticAndCustomizationOptions) o;
    return Objects.equals(this.colorOptions, prefabElementAestheticAndCustomizationOptions.colorOptions) &&
        Objects.equals(this.texture, prefabElementAestheticAndCustomizationOptions.texture) &&
        Objects.equals(this.modularAdaptability, prefabElementAestheticAndCustomizationOptions.modularAdaptability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorOptions, texture, modularAdaptability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementAestheticAndCustomizationOptions {\n");
    sb.append("    colorOptions: ").append(toIndentedString(colorOptions)).append("\n");
    sb.append("    texture: ").append(toIndentedString(texture)).append("\n");
    sb.append("    modularAdaptability: ").append(toIndentedString(modularAdaptability)).append("\n");
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

