package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ds;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.protocal.c.bqr;
import com.tencent.mm.protocal.c.bqt;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class ab
  extends ds
{
  public static c.a fTp;
  public String mJz;
  private ass rjg;
  public bqr rjh;
  public bqu rji;
  public boolean rjj;
  public String rjk;
  public String rjl;
  public String rjm;
  public String rjn;
  
  static
  {
    GMTrace.i(6888322236416L, 51322);
    c.a locala = new c.a();
    locala.gZM = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "wallet_region";
    locala.vmt.put("wallet_region", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" wallet_region INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "wallet_region";
    locala.columns[1] = "wallet_grey_item_buf";
    locala.vmt.put("wallet_grey_item_buf", "BLOB");
    localStringBuilder.append(" wallet_grey_item_buf BLOB");
    locala.columns[2] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(6888322236416L, 51322);
  }
  
  public ab()
  {
    GMTrace.i(6888053800960L, 51320);
    this.rjg = new ass();
    this.rjh = null;
    this.rji = null;
    this.rjj = false;
    this.rjk = "";
    this.rjl = "";
    this.rjm = "";
    this.mJz = "";
    this.rjn = "";
    if (this.rjh == null) {
      this.rjh = new bqr();
    }
    if (this.rji == null) {
      this.rji = new bqu();
    }
    GMTrace.o(6888053800960L, 51320);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6888188018688L, 51321);
    super.b(paramCursor);
    this.rjg = new ass();
    try
    {
      this.rjg = ((ass)this.rjg.aD(this.field_wallet_grey_item_buf));
      this.rjh = this.rjg.uIA;
      this.rji = this.rjg.uIB;
      this.rjj = this.rjg.uIC;
      this.rjn = "";
      paramCursor = this.rjg.uID.iterator();
      for (;;)
      {
        if (paramCursor.hasNext())
        {
          String str = (String)paramCursor.next();
          this.rjn = (this.rjn + str + "\n");
          continue;
          if (this.rjh != null) {
            break;
          }
        }
      }
    }
    catch (Exception paramCursor)
    {
      w.e("WalletRegionGreyItem", "parser PayIBGGetOverseaWalletRsp error");
    }
    for (;;)
    {
      this.rjh = new bqr();
      if (this.rji == null) {
        this.rji = new bqu();
      }
      GMTrace.o(6888188018688L, 51321);
      return;
      if (this.rjg.uIy != null)
      {
        this.rjk = n.a(this.rjg.uIy.vaH);
        this.rjl = n.a(this.rjg.uIy.vaI);
      }
      if (this.rjg.uIz != null)
      {
        this.rjm = n.a(this.rjg.uIz.vaF);
        this.mJz = n.a(this.rjg.uIz.vaG);
      }
      w.v("WalletRegionGreyItem", "noticeContent %s", new Object[] { this.rjm });
    }
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6887919583232L, 51319);
    c.a locala = fTp;
    GMTrace.o(6887919583232L, 51319);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */