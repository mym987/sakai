/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package uk.ac.cam.caret.sakai.rwiki.model.test;

/**
 * @author David Haines
 *
 */
import uk.ac.cam.caret.sakai.rwiki.model.RWikiObjectContentImpl;
import junit.framework.TestCase;

public class RWikiObjectContentImplTest extends TestCase {

        RWikiObjectContentImpl roci = null;
        
        protected void setUp() throws Exception {
                super.setUp();
                roci = new RWikiObjectContentImpl();
        }

        public void testSetContentString() {
                String testContent = "testContentString";
                roci.setContent(testContent);
                assertTrue("content mismatch",testContent.equals(roci.getContent()));
        }
        
        public void testSetContentEmptyString() {
                String testContent = "";
                roci.setContent(testContent);
                assertTrue("content mismatch",testContent.equals(roci.getContent()));
        }
        
        public void testSetContentNull() {
                String testContent = null;
                roci.setContent(testContent);
                assertTrue("content mismatch","".equals(roci.getContent()));
        }

}
