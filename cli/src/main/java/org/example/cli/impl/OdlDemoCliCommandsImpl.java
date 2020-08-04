/*
 * Copyright © 2018 zongqi and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.example.cli.impl;

import org.example.cli.api.OdlDemoCliCommands;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OdlDemoCliCommandsImpl implements OdlDemoCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(OdlDemoCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public OdlDemoCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("OdlDemoCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}
