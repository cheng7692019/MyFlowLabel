# MyFlowLabel
Streaming layout of the label control, support for radio, multi-election. Location support left and right
Streaming layout of the label view, can be used for radio, multi-election. The label control will automatically adapt to the width of the automatic line feed, the realization of the flow layout, an increase of the outer packaging label controls, more convenient for your use

![image](https://github.com/cheng7692019/MyFlowLabel/blob/master/preview/20171015_224814.gif)  

# Usage

```xml
   <mystickyactivity.chen.com.mylabel.LabelGroup
                android:id="@+id/lab2_cloud"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_below="@+id/lab_cloud"
                android:layout_marginTop="10dp"
                app:allCaps="false"
                app:deselectTransitionMS="500"
                app:deselectedColor="@color/white"
                app:deselectedFontColor="@color/black"
                app:gravity="left"
                app:minHorizontalSpacing="32dp"
                app:selectMode="required"
                app:selectTransitionMS="750"
                app:selectedColor="@color/white"
                app:selectedFontColor="@color/red"
                app:textSize="14sp"
                app:verticalSpacing="16dp" />
```
# Attributes

| Attribute                | Format                       | Description   |
|--------------------------|------------------------------|---------------|
| gravity                  |left、center、right           |Selected position, left middle right
|                                 
| deselectTransitionMS     |300                          |From the selected time to not select the color change
|
| deselectedColor          |#ffffff                      |Unselected background color
|
| deselectedFontColor      |#000000                      |Unselected font color
|
| selectMode               |single、multi、required      |Select the pattern
|
   
# Licence
Copyright 2016 cheng7692019

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.



