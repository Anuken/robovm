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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPTimedMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPTimedMetadataPtr extends Ptr<MPTimedMetadata, MPTimedMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPTimedMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPTimedMetadata() {}
    protected MPTimedMetadata(Handle h, long handle) { super(h, handle); }
    protected MPTimedMetadata(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "key")
    public native String getKey();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "keyspace")
    public native String getKeyspace();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "value")
    public native NSObject getValue();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "timestamp")
    public native double getTimestamp();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Property(selector = "allMetadata")
    public native NSDictionary getAllMetadata();
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getName() {
        NSDictionary<NSString, NSObject> data = getAllMetadata();
        if (data.containsKey(Name())) {
            NSString val = (NSString) data.get(Name());
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getInfo() {
        NSDictionary<NSString, NSObject> data = getAllMetadata();
        if (data.containsKey(Info())) {
            NSString val = (NSString) data.get(Info());
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getMIMEType() {
        NSDictionary<NSString, NSObject> data = getAllMetadata();
        if (data.containsKey(MIMEType())) {
            NSString val = (NSString) data.get(MIMEType());
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getDataType() {
        NSDictionary<NSString, NSObject> data = getAllMetadata();
        if (data.containsKey(DataType())) {
            NSString val = (NSString) data.get(DataType());
            return val.toString();
        }
        return null;
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public String getLanguageCode() {
        NSDictionary<NSString, NSObject> data = getAllMetadata();
        if (data.containsKey(LanguageCode())) {
            NSString val = (NSString) data.get(LanguageCode());
            return val.toString();
        }
        return null;
    }
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerTimedMetadataKeyName", optional=true)
    protected static native NSString Name();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerTimedMetadataKeyInfo", optional=true)
    protected static native NSString Info();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerTimedMetadataKeyMIMEType", optional=true)
    protected static native NSString MIMEType();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerTimedMetadataKeyDataType", optional=true)
    protected static native NSString DataType();
    /**
     * @deprecated Deprecated in iOS 9.0. Use AVFoundation.
     */
    @Deprecated
    @GlobalValue(symbol="MPMoviePlayerTimedMetadataKeyLanguageCode", optional=true)
    protected static native NSString LanguageCode();
    
    
    /*</methods>*/
}
