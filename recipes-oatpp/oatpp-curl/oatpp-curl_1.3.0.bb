#############################################################################
#
# Project         _____    __   ____   _      _
#                (  _  )  /__\ (_  _)_| |_  _| |_
#                 )(_)(  /(__)\  )( (_   _)(_   _)
#                (_____)(__)(__)(__)  |_|    |_|
#
#
# Copyright 2021-present, Benedikt-Alexander Mokroß <github@bamkrs.de>
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
#############################################################################

DESCRIPTION = "Oat++ Curl" 
inherit oatpp-module

SRCREV = "779b8b3a632d006ec7395fc570f1e1e14edcc595"

DEPENDS:append = " curl"
