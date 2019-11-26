/*
 Licensed to Diennea S.r.l. under one
 or more contributor license agreements. See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership. Diennea S.r.l. licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.

 */
package org.bookkeepervisualmanager.cache;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A record in this table means that a ledger is placed over a Bookie
 *
 * @author eolivelli
 */
@Entity(name = "ledger_bookie")
@SuppressFBWarnings({"EI_EXPOSE_REP2", "EI_EXPOSE_REP"})
public class LedgerBookie implements Serializable {

    @Column(columnDefinition = "long")
    @Id
    private long ledgerId;

    @Column(columnDefinition = "string")
    @Id
    private String bookieAddress;

    public LedgerBookie() {
    }

    public LedgerBookie(long ledgerId, String bookieAddress) {
        this.ledgerId = ledgerId;
        this.bookieAddress = bookieAddress;
    }

    public long getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(long ledgerId) {
        this.ledgerId = ledgerId;
    }

    public String getBookieAddress() {
        return bookieAddress;
    }

    public void setBookieAddress(String bookieAddress) {
        this.bookieAddress = bookieAddress;
    }

}
