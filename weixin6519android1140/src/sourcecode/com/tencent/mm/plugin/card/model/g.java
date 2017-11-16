package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ab;
import com.tencent.mm.protocal.c.jk;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class g
  extends ab
{
  protected static c.a fTp;
  public String jza;
  public String jzb;
  public String jzc;
  public String jzd;
  public String jze;
  public boolean jzf;
  public jk jzg;
  public jo jzh;
  public List<a> jzi;
  public List<b> jzj;
  public int jzk;
  public int jzl;
  public boolean jzm;
  public List<c> jzn;
  
  static
  {
    GMTrace.i(4908744966144L, 36573);
    c.a locala = new c.a();
    locala.gZM = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_type";
    locala.vmt.put("card_type", "INTEGER");
    localStringBuilder.append(" card_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[1] = "title";
    locala.vmt.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "description";
    locala.vmt.put("description", "TEXT");
    localStringBuilder.append(" description TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "logo_url";
    locala.vmt.put("logo_url", "TEXT");
    localStringBuilder.append(" logo_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "time";
    locala.vmt.put("time", "INTEGER");
    localStringBuilder.append(" time INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "card_id";
    locala.vmt.put("card_id", "TEXT");
    localStringBuilder.append(" card_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "card_tp_id";
    locala.vmt.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "msg_id";
    locala.vmt.put("msg_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" msg_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "msg_id";
    locala.columns[8] = "msg_type";
    locala.vmt.put("msg_type", "INTEGER");
    localStringBuilder.append(" msg_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "jump_type";
    locala.vmt.put("jump_type", "INTEGER");
    localStringBuilder.append(" jump_type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "url";
    locala.vmt.put("url", "TEXT");
    localStringBuilder.append(" url TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "buttonData";
    locala.vmt.put("buttonData", "BLOB");
    localStringBuilder.append(" buttonData BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "operData";
    locala.vmt.put("operData", "BLOB");
    localStringBuilder.append(" operData BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "report_scene";
    locala.vmt.put("report_scene", "INTEGER");
    localStringBuilder.append(" report_scene INTEGER");
    localStringBuilder.append(", ");
    locala.columns[14] = "read_state";
    locala.vmt.put("read_state", "INTEGER default '0' ");
    localStringBuilder.append(" read_state INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "accept_buttons";
    locala.vmt.put("accept_buttons", "TEXT");
    localStringBuilder.append(" accept_buttons TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "consumed_box_id";
    locala.vmt.put("consumed_box_id", "TEXT");
    localStringBuilder.append(" consumed_box_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "jump_buttons";
    locala.vmt.put("jump_buttons", "TEXT");
    localStringBuilder.append(" jump_buttons TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "logo_color";
    locala.vmt.put("logo_color", "TEXT");
    localStringBuilder.append(" logo_color TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "unavailable_qr_code_list";
    locala.vmt.put("unavailable_qr_code_list", "TEXT");
    localStringBuilder.append(" unavailable_qr_code_list TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "all_unavailable";
    locala.vmt.put("all_unavailable", "INTEGER default 'false' ");
    localStringBuilder.append(" all_unavailable INTEGER default 'false' ");
    locala.columns[21] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(4908744966144L, 36573);
  }
  
  public g()
  {
    GMTrace.i(4907939659776L, 36567);
    this.jza = "";
    this.jzb = "";
    this.jzf = false;
    this.jzi = null;
    this.jzj = null;
    this.jzk = 0;
    this.jzl = 0;
    this.jzn = null;
    GMTrace.o(4907939659776L, 36567);
  }
  
  public final jk akd()
  {
    GMTrace.i(4908208095232L, 36569);
    jk localjk1;
    if (this.jzg != null)
    {
      localjk1 = this.jzg;
      GMTrace.o(4908208095232L, 36569);
      return localjk1;
    }
    try
    {
      this.jzg = ((jk)new jk().aD(this.field_buttonData));
      localjk1 = this.jzg;
      GMTrace.o(4908208095232L, 36569);
      return localjk1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardMsgInfo", "getCardButton fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardMsgInfo", localException, "", new Object[0]);
      jk localjk2 = new jk();
      GMTrace.o(4908208095232L, 36569);
      return localjk2;
    }
  }
  
  public final jo ake()
  {
    GMTrace.i(4908342312960L, 36570);
    jo localjo1;
    if (this.jzh != null)
    {
      localjo1 = this.jzh;
      GMTrace.o(4908342312960L, 36570);
      return localjo1;
    }
    try
    {
      this.jzh = ((jo)new jo().aD(this.field_operData));
      localjo1 = this.jzh;
      GMTrace.o(4908342312960L, 36570);
      return localjo1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardMsgInfo", "getOperationRegion fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardMsgInfo", localException, "", new Object[0]);
      jo localjo2 = new jo();
      GMTrace.o(4908342312960L, 36570);
      return localjo2;
    }
  }
  
  public final void akf()
  {
    GMTrace.i(4908476530688L, 36571);
    if (this.jzi == null)
    {
      this.jzi = new ArrayList();
      if (bg.nm(this.field_accept_buttons))
      {
        GMTrace.o(4908476530688L, 36571);
        return;
      }
      Map localMap = bh.q(this.field_accept_buttons, "accept_buttons_list");
      if (localMap == null)
      {
        GMTrace.o(4908476530688L, 36571);
        return;
      }
      int i = 0;
      if (i < 100)
      {
        Object localObject2 = new StringBuilder(".accept_buttons_list.accept_buttons");
        if (i > 0) {}
        for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
        {
          localObject1 = localObject1;
          localObject2 = (String)localMap.get((String)localObject1 + ".card_id");
          String str = (String)localMap.get((String)localObject1 + ".title");
          if ((bg.nm((String)localObject2)) && (bg.nm(str))) {
            break label461;
          }
          int j = bg.getInt((String)localMap.get((String)localObject1 + ".end_time"), 0);
          if ((j == 0) || (j > bg.Pu()))
          {
            localObject2 = new a();
            ((a)localObject2).title = ((String)localMap.get((String)localObject1 + ".title"));
            ((a)localObject2).jzo = ((String)localMap.get((String)localObject1 + ".sub_title"));
            ((a)localObject2).jzp = ((String)localMap.get((String)localObject1 + ".card_ext"));
            ((a)localObject2).cardId = ((String)localMap.get((String)localObject1 + ".card_id"));
            ((a)localObject2).jzr = bg.getInt((String)localMap.get((String)localObject1 + ".action_type"), 0);
            ((a)localObject2).jzq = j;
            this.jzi.add(localObject2);
          }
          i += 1;
          break;
        }
      }
    }
    label461:
    GMTrace.o(4908476530688L, 36571);
  }
  
  public final void akg()
  {
    GMTrace.i(4908610748416L, 36572);
    if (this.jzj == null)
    {
      this.jzj = new ArrayList();
      if (bg.nm(this.field_jump_buttons))
      {
        GMTrace.o(4908610748416L, 36572);
        return;
      }
      Map localMap = bh.q(this.field_jump_buttons, "jump_buttons_list");
      if (localMap == null)
      {
        GMTrace.o(4908610748416L, 36572);
        return;
      }
      int i = 0;
      if (i < 100)
      {
        Object localObject2 = new StringBuilder(".jump_buttons_list.jump_buttons");
        if (i > 0) {}
        for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
        {
          localObject1 = localObject1;
          if (bg.nm((String)localMap.get((String)localObject1 + ".title"))) {
            break label317;
          }
          localObject2 = new b();
          ((b)localObject2).title = ((String)localMap.get((String)localObject1 + ".title"));
          ((b)localObject2).description = ((String)localMap.get((String)localObject1 + ".description"));
          ((b)localObject2).jzt = ((String)localMap.get((String)localObject1 + ".button_wording"));
          ((b)localObject2).jzu = ((String)localMap.get((String)localObject1 + ".jump_url"));
          this.jzj.add(localObject2);
          i += 1;
          break;
        }
      }
    }
    label317:
    GMTrace.o(4908610748416L, 36572);
  }
  
  public final void akh()
  {
    GMTrace.i(18909398827008L, 140886);
    if (this.jzn == null)
    {
      this.jzn = new ArrayList();
      if (bg.nm(this.field_unavailable_qr_code_list))
      {
        GMTrace.o(18909398827008L, 140886);
        return;
      }
      Map localMap = bh.q(this.field_unavailable_qr_code_list, "unavailable_qr_code_list");
      if (localMap == null)
      {
        GMTrace.o(18909398827008L, 140886);
        return;
      }
      int i = 0;
      if (i < 100)
      {
        Object localObject2 = new StringBuilder(".unavailable_qr_code_list.unavailable_qr_codes");
        if (i > 0) {}
        for (Object localObject1 = Integer.valueOf(i);; localObject1 = "")
        {
          localObject1 = localObject1;
          if (bg.nm((String)localMap.get((String)localObject1 + ".code_id"))) {
            break label214;
          }
          localObject2 = new c();
          ((c)localObject2).jzv = ((String)localMap.get((String)localObject1 + ".code_id"));
          this.jzn.add(localObject2);
          i += 1;
          break;
        }
      }
    }
    label214:
    GMTrace.o(18909398827008L, 140886);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4908073877504L, 36568);
    c.a locala = fTp;
    GMTrace.o(4908073877504L, 36568);
    return locala;
  }
  
  public final class a
  {
    public String cardId;
    public String jzo;
    public String jzp;
    public int jzq;
    public int jzr;
    public String title;
    
    public a()
    {
      GMTrace.i(4923106263040L, 36680);
      GMTrace.o(4923106263040L, 36680);
    }
  }
  
  public final class b
  {
    public String description;
    public String jzt;
    public String jzu;
    public String title;
    
    public b()
    {
      GMTrace.i(4912905715712L, 36604);
      GMTrace.o(4912905715712L, 36604);
    }
  }
  
  public final class c
  {
    public String jzv;
    
    public c()
    {
      GMTrace.i(18907519778816L, 140872);
      GMTrace.o(18907519778816L, 140872);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */