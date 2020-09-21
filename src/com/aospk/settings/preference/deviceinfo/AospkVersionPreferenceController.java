/*
 * Copyright (C) 2018 The LineageOS Project
 * Copyright (C) 2019 RevengeOS
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

package com.aospk.settings.preference.deviceinfo;

import android.content.Context;
import android.os.SystemProperties;

import com.android.settings.core.BasePreferenceController;
import com.android.settings.R;

public class RevengeOSVersionPreferenceController extends BasePreferenceController {

    private final String KEY_REVENGEOS_VERSION_PROP = "ro.aospk.version";
 
    public RevengeOSVersionPreferenceController(Context context,
            String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE_UNSEARCHABLE;
    }

    @Override
    public CharSequence getSummary() {
        return SystemProperties.get(KEY_REVENGEOS_VERSION_PROP,
                mContext.getString(R.string.unknown));
    }
}
