package com.tencent.mm.bc;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;

public final class m
  extends j
{
  public static final String[] fTX;
  private g goN;
  
  static
  {
    GMTrace.i(1423647440896L, 10607);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS verifycontact ( id INTEGER PRIMARY KEY, username varchar(40), nickname varchar(40), fullpy varchar(60), shortpy varchar(40), imgflag int, scene int, content text, status int, reserved1 int,reserved2 int,reserved3 text,reserved4 text)", "CREATE UNIQUE INDEX IF NOT EXISTS verifyContactIndex  ON verifycontact ( username )" };
    GMTrace.o(1423647440896L, 10607);
  }
  
  public m(g paramg)
  {
    GMTrace.i(1423513223168L, 10606);
    this.goN = paramg;
    GMTrace.o(1423513223168L, 10606);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */