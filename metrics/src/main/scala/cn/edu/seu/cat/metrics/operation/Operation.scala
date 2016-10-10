/*
 * Copyright 2015 Junxue Zhang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.edu.seu.cat.metrics.operation

import cn.edu.seu.cat.metrics.Metrics

/**
 * Created by snow on 15/6/15.
 */

/**
 * Query Metrics
 * Rest -> Master
 */
case class QueryMetrics()
case class QueryMetricsSuccess(metricsInfo: Map[String, Metrics])
