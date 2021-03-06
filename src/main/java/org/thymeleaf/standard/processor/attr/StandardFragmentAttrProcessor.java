/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.standard.processor.attr;

import org.thymeleaf.processor.attr.AbstractNoOpAttrProcessor;

/**
 * Gives a name to sections of your template that are available for inclusion by
 * the <b>th:include</b> and <b>th:substituteby</b> processors.
 * 
 * @author Daniel Fern&aacute;ndez
 * @since 1.0
 */
public final class StandardFragmentAttrProcessor 
        extends AbstractNoOpAttrProcessor {

    
    public static final int ATTR_PRECEDENCE = 1500;
    public static final String ATTR_NAME = "fragment";
    
    
    
    public StandardFragmentAttrProcessor() {
        super(ATTR_NAME);
    }



    @Override
    public int getPrecedence() {
        return ATTR_PRECEDENCE;
    }


    
}
