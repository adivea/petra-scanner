#!/usr/bin/env bash

cd module

echo "No_measurements_to_take=No measurements to take" >> english.0.properties

echo "
.button {
  margin-left: 20%;
  width:       80%;
}

.input-field {
  margin-left: 20%;
  width:       80%;
}

.text-area {
  margin-left: 20%;
  width:       80%;
}

.gallery {
  margin-left: 20%;
  width:       80%;
}

.file-gallery {
  margin-left: 20%;
  width:       80%;
}

.file-list {
  margin-left: 20%;
  width:       80%;
}

.dropdown {
  margin-left: 20%;
  width:       80%;
}

.checkbox {
  margin-left: 20%;
  width:       80%;
}

.radio-group {
  margin-left: 20%;
  width:       80%;
}

.list {
  margin-left: 20%;
  width:       80%;
}

.date-picker {
  margin-left: 20%;
  width:       80%;
}

.time-picker {
  margin-left: 20%;
  width:       80%;
}

.web-view {
  margin-left: 20%;
  width:       80%;
}

.table-view {
  margin-left: 20%;
  width:       80%;
}

.required {
  margin-left: 20%;
  width:       80%;
}" >> ui_styling.css
