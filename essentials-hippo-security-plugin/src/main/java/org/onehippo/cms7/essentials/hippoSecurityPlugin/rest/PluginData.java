/*
 * Copyright 2022 Bloomreach Inc. (https://www.bloomreach.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onehippo.cms7.essentials.hippoSecurityPlugin.rest;

public class PluginData {

    private String exampleProperty;
    private String namespace;

    public String getExampleProperty() {
        return exampleProperty;
    }

    public void setExampleProperty(final String exampleProperty) {
        this.exampleProperty = exampleProperty;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    @Override
    public String toString() {
        return "PluginData{" +
                "exampleProperty='" + exampleProperty + '\'' +
                '}';
    }
}
