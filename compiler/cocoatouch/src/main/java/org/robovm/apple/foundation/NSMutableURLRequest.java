/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMutableURLRequest/*</name>*/ 
    extends /*<extends>*/NSURLRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSMutableURLRequestPtr extends Ptr<NSMutableURLRequest, NSMutableURLRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMutableURLRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMutableURLRequest() {}
    protected NSMutableURLRequest(Handle h, long handle) { super(h, handle); }
    protected NSMutableURLRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:")
    public NSMutableURLRequest(NSURL URL) { super(URL); }
    @Method(selector = "initWithURL:cachePolicy:timeoutInterval:")
    public NSMutableURLRequest(NSURL URL, NSURLRequestCachePolicy cachePolicy, double timeoutInterval) { super(URL, cachePolicy, timeoutInterval); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "cachePolicy")
    public native NSURLRequestCachePolicy getCachePolicy();
    @Property(selector = "setCachePolicy:")
    public native void setCachePolicy(NSURLRequestCachePolicy v);
    @Property(selector = "timeoutInterval")
    public native double getTimeoutInterval();
    @Property(selector = "setTimeoutInterval:")
    public native void setTimeoutInterval(double v);
    @Property(selector = "mainDocumentURL")
    public native NSURL getMainDocumentURL();
    @Property(selector = "setMainDocumentURL:")
    public native void setMainDocumentURL(NSURL v);
    @Property(selector = "networkServiceType")
    public native NSURLRequestNetworkServiceType getNetworkServiceType();
    @Property(selector = "setNetworkServiceType:")
    public native void setNetworkServiceType(NSURLRequestNetworkServiceType v);
    @Property(selector = "allowsCellularAccess")
    public native boolean allowsCellularAccess();
    @Property(selector = "setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "allowsExpensiveNetworkAccess")
    public native boolean allowsExpensiveNetworkAccess();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAllowsExpensiveNetworkAccess:")
    public native void setAllowsExpensiveNetworkAccess(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "allowsConstrainedNetworkAccess")
    public native boolean allowsConstrainedNetworkAccess();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setAllowsConstrainedNetworkAccess:")
    public native void setAllowsConstrainedNetworkAccess(boolean v);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "assumesHTTP3Capable")
    public native boolean isAssumesHTTP3Capable();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "setAssumesHTTP3Capable:")
    public native void setAssumesHTTP3Capable(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "HTTPMethod")
    public native String getHTTPMethod();
    @Property(selector = "setHTTPMethod:")
    public native void setHTTPMethod(String v);
    @Property(selector = "allHTTPHeaderFields")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> getAllHTTPHeaderFields();
    @Property(selector = "setAllHTTPHeaderFields:")
    public native void setAllHTTPHeaderFields(@org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> v);
    @Property(selector = "HTTPBody")
    public native NSData getHTTPBody();
    @Property(selector = "setHTTPBody:")
    public native void setHTTPBody(NSData v);
    @Property(selector = "HTTPBodyStream")
    public native NSInputStream getHTTPBodyStream();
    @Property(selector = "setHTTPBodyStream:")
    public native void setHTTPBodyStream(NSInputStream v);
    @Property(selector = "HTTPShouldHandleCookies")
    public native boolean shouldHandleHTTPCookies();
    @Property(selector = "setHTTPShouldHandleCookies:")
    public native void setShouldHandleHTTPCookies(boolean v);
    @Property(selector = "HTTPShouldUsePipelining")
    public native boolean shouldUseHTTPPipelining();
    @Property(selector = "setHTTPShouldUsePipelining:")
    public native void setShouldUseHTTPPipelining(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setHTTPHeaderField(String field, String value) {
        setHTTPHeaderField0(value, field);
    }
    public void addHTTPHeaderField(String field, String value) {
        addHTTPHeaderField0(value, field);
    }
    /*<methods>*/
    @Method(selector = "setValue:forHTTPHeaderField:")
    protected native void setHTTPHeaderField0(String value, String field);
    @Method(selector = "addValue:forHTTPHeaderField:")
    protected native void addHTTPHeaderField0(String value, String field);
    /*</methods>*/
}
