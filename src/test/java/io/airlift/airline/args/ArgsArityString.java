/**
 * Copyright (C) 2010 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.airlift.airline.args;

import io.airlift.airline.Arguments;
import io.airlift.airline.Command;
import io.airlift.airline.Option;

import java.util.List;

/**
 * Test parameter arity.
 *
 * @author cbeust
 */
@Command(name="ArgsArityString")
public class ArgsArityString
{

    @Option(name = "-pairs", arity = 2, description = "Pairs")
    public List<String> pairs;

    @Arguments(description = "Rest")
    public List<String> rest;
}
