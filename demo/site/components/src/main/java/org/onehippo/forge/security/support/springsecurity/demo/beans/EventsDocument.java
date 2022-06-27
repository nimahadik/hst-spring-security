package org.onehippo.forge.security.support.springsecurity.demo.beans;
/*
 * Copyright 2014-2022 Bloomreach Inc. (https://www.bloomreach.com)
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
import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "hstspringsecdemo:eventsdocument")
@Node(jcrType="hstspringsecdemo:eventsdocument")
public class EventsDocument extends HippoDocument {

    /**
     * The document type of the events document.
     */
    public static final String DOCUMENT_TYPE = "hstspringsecdemo:eventsdocument";

    private static final String TITLE = "hstspringsecdemo:title";
    private static final String DATE = "hstspringsecdemo:date";
    private static final String INTRODUCTION = "hstspringsecdemo:introduction";
    private static final String IMAGE = "hstspringsecdemo:image";
    private static final String CONTENT = "hstspringsecdemo:content";
    private static final String LOCATION = "hstspringsecdemo:location";
    private static final String END_DATE = "hstspringsecdemo:enddate";

    /**
     * Get the title of the document.
     *
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "hstspringsecdemo:title")
    public String getTitle() {
        return getSingleProperty(TITLE);
    }

    /**
     * Get the date of the document, i.e. the start date of the event.
     *
     * @return the (start) date
     */
    @HippoEssentialsGenerated(internalName = "hstspringsecdemo:date")
    public Calendar getDate() {
        return getSingleProperty(DATE);
    }

    /**
     * Get the introduction of the document.
     *
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "hstspringsecdemo:introduction")
    public String getIntroduction() {
        return getSingleProperty(INTRODUCTION);
    }

    /**
     * Get the image of the document.
     *
     * @return the image
     */
    @HippoEssentialsGenerated(internalName = "hstspringsecdemo:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean(IMAGE, HippoGalleryImageSet.class);
    }

    /**
     * Get the main content of the document.
     *
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "hstspringsecdemo:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /**
     * Get the location of the document.
     *
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "hstspringsecdemo:location")
    public String getLocation() {
        return getSingleProperty(LOCATION);
    }

    /**
     * Get the end date of the document, i.e. the end date of the event.
     *
     * @return the end date
     */
    @HippoEssentialsGenerated(internalName = "hstspringsecdemo:enddate")
    public Calendar getEndDate() {
        return getSingleProperty(END_DATE);
    }

}
