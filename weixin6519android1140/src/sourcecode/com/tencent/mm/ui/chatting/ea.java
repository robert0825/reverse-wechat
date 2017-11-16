package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.a.it.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class ea
{
  private Context context;
  private x eMY;
  private SimpleDateFormat iZf;
  String lyL;
  private String wGF;
  ArrayList<Uri> wGG;
  List<au> wuG;
  
  public ea(Context paramContext, List<au> paramList, x paramx)
  {
    GMTrace.i(2364245278720L, 17615);
    this.wGF = null;
    this.eMY = null;
    this.iZf = new SimpleDateFormat("yyyy-MM-dd");
    this.lyL = null;
    this.wGG = new ArrayList();
    this.context = paramContext;
    this.wuG = paramList;
    this.eMY = paramx;
    GMTrace.o(2364245278720L, 17615);
  }
  
  private String aF(au paramau)
  {
    GMTrace.i(2364647931904L, 17618);
    String str = null;
    if (!this.eMY.field_username.endsWith("@chatroom")) {
      str = r.fs(paramau.field_talker);
    }
    for (;;)
    {
      if (paramau.field_isSend == 1)
      {
        w.i("MicroMsg.OtherMailHistoryExporter", "isSend");
        str = q.zG();
      }
      long l = paramau.field_createTime;
      paramau = new SimpleDateFormat("HH:mm").format(new Date(l));
      Object localObject = new StringBuilder("");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("  ");
      ((StringBuilder)localObject).append(paramau);
      paramau = ((StringBuilder)localObject).toString();
      GMTrace.o(2364647931904L, 17618);
      return paramau;
      localObject = paramau.field_content;
      int i = bc.gO((String)localObject);
      if (i != -1) {
        str = r.fs(((String)localObject).substring(0, i).trim());
      }
    }
  }
  
  private String cex()
  {
    GMTrace.i(2364513714176L, 17617);
    Object localObject;
    if (!this.eMY.field_username.endsWith("@chatroom"))
    {
      str1 = this.context.getString(R.l.dXu);
      localObject = this.eMY.vj();
      at.AR();
      str1 = String.format(str1, new Object[] { localObject, com.tencent.mm.y.c.xh().get(4, null) });
      GMTrace.o(2364513714176L, 17617);
      return str1;
    }
    if (bg.nm(this.eMY.field_nickname))
    {
      localObject = m.fi(this.eMY.field_username).iterator();
      String str2;
      for (str1 = ""; ((Iterator)localObject).hasNext(); str1 = str1 + str2 + ", ") {
        str2 = r.fs((String)((Iterator)localObject).next());
      }
    }
    for (String str1 = str1.substring(0, str1.length() - 2);; str1 = this.eMY.vj())
    {
      str1 = String.format(this.context.getString(R.l.dXt), new Object[] { str1 });
      break;
    }
  }
  
  private String fb(long paramLong)
  {
    GMTrace.i(2364782149632L, 17619);
    String str = this.iZf.format(new Date(paramLong));
    GMTrace.o(2364782149632L, 17619);
    return str;
  }
  
  public final String cew()
  {
    GMTrace.i(2364379496448L, 17616);
    if (this.lyL == null) {}
    Object localObject1;
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.OtherMailHistoryExporter", "export: history is null? %B, selectItems.size = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.wuG.size()) });
      if (this.lyL == null) {
        break;
      }
      localObject1 = this.lyL;
      GMTrace.o(2364379496448L, 17616);
      return (String)localObject1;
    }
    this.wGG.clear();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(cex());
    localStringBuilder.append("\n\n");
    Iterator localIterator = this.wuG.iterator();
    au localau;
    if (localIterator.hasNext())
    {
      localau = (au)localIterator.next();
      if (this.wGF == null)
      {
        this.wGF = fb(localau.field_createTime);
        localStringBuilder.append(String.format("—————  %s  —————\n\n", new Object[] { this.wGF }));
        localStringBuilder.append("\n");
        label201:
        if (!localau.bTF()) {
          break label438;
        }
        if (!localau.bTF()) {
          break label432;
        }
        if (localau.field_isSend != 1) {
          break label330;
        }
        localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aF(localau), localau.field_content });
      }
    }
    for (;;)
    {
      localStringBuilder.append((String)localObject1);
      break;
      localObject1 = fb(localau.field_createTime);
      if (((String)localObject1).equals(this.wGF)) {
        break label201;
      }
      this.wGF = ((String)localObject1);
      localStringBuilder.append(String.format("—————  %s  —————\n\n", new Object[] { this.wGF }));
      localStringBuilder.append("\n");
      break label201;
      label330:
      if (!this.eMY.field_username.endsWith("@chatroom"))
      {
        localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aF(localau), localau.field_content });
      }
      else
      {
        int i = bc.gO(localau.field_content);
        if (i != -1)
        {
          localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aF(localau), localau.field_content.substring(i + 1).trim() });
          continue;
          label432:
          localObject1 = null;
          continue;
          label438:
          Object localObject2;
          if (localau.bTC())
          {
            if (localau.bTC())
            {
              long l1 = localau.field_msgId;
              long l2 = localau.field_msgSvrId;
              localObject2 = dp.eZ(l1);
              localObject1 = localObject2;
              if (bg.nm((String)localObject2)) {
                localObject1 = dp.fa(l2);
              }
              w.d("MicroMsg.OtherMailHistoryExporter", "hdPath[%s]", new Object[] { localObject1 });
              if (!bg.nm((String)localObject1))
              {
                localObject2 = "file://" + (String)localObject1;
                this.wGG.add(Uri.parse((String)localObject2));
                localObject1 = String.format("[%s: %s(%s)]", new Object[] { this.context.getString(R.l.dnz), new File((String)localObject1).getName(), this.context.getString(R.l.dnv) });
              }
            }
            for (localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aF(localau), localObject1 });; localObject1 = null)
            {
              localStringBuilder.append((String)localObject1);
              break;
            }
          }
          if (localau.bTu()) {
            localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.dnE) });
          }
          for (;;)
          {
            w.i("MicroMsg.OtherMailHistoryExporter", "formatOtherMsg, msgStr = %s", new Object[] { localObject1 });
            localStringBuilder.append(String.format("%s\n\n%s\n\n", new Object[] { aF(localau), localObject1 }));
            break;
            if (localau.bTy())
            {
              if (localau.field_isSend == 1) {
                localObject1 = this.context.getString(R.l.dnC);
              } else {
                localObject1 = this.context.getString(R.l.dnB);
              }
            }
            else if (localau.bTE())
            {
              localObject1 = new it();
              ((it)localObject1).eMp.eMj = 1;
              ((it)localObject1).eMp.eAH = localau;
              a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
              localObject1 = String.format("[%s]", new Object[] { ((it)localObject1).eMq.eMs });
            }
            else
            {
              if (localau.aCp())
              {
                localObject1 = f.a.eS(bg.Sx(localau.field_content));
                if (localObject1 != null)
                {
                  switch (((f.a)localObject1).type)
                  {
                  }
                  for (;;)
                  {
                    localObject2 = g.aP(((f.a)localObject1).appId, true);
                    if (localObject2 != null) {
                      break label983;
                    }
                    localObject1 = "";
                    break;
                    localObject2 = an.afP().Op(((f.a)localObject1).eAE);
                    if (localObject2 != null)
                    {
                      localObject2 = new File(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
                      if (((File)localObject2).exists()) {
                        this.wGG.add(Uri.fromFile((File)localObject2));
                      }
                    }
                  }
                  label983:
                  localObject2 = ((f)localObject2).field_appName;
                  if (6 == ((f.a)localObject1).type)
                  {
                    localObject1 = String.format("[%s: %s(%s)]", new Object[] { this.context.getString(R.l.dnu), localObject2, this.context.getString(R.l.dnv) });
                    continue;
                  }
                  localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(R.l.dnu), localObject2 });
                }
              }
              else
              {
                if (localau.bTD())
                {
                  at.AR();
                  localObject1 = com.tencent.mm.y.c.yM().Cn(localau.field_content).eCQ;
                  localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(R.l.dnw), localObject1 });
                  continue;
                }
                if (localau.bTG())
                {
                  localObject1 = this.context.getString(R.l.dnD);
                  o.Nh();
                  localObject2 = String.format("[%s: %s(%s)]", new Object[] { localObject1, new File(s.mk(localau.field_imgPath)).getName(), this.context.getString(R.l.dnv) });
                  o.Nh();
                  File localFile = new File(s.mk(localau.field_imgPath));
                  localObject1 = localObject2;
                  if (!localFile.exists()) {
                    continue;
                  }
                  this.wGG.add(Uri.fromFile(localFile));
                  localObject1 = localObject2;
                  continue;
                }
                if ((localau.bTI()) || (localau.bTJ()))
                {
                  localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.dnx) });
                  continue;
                  localStringBuilder.append("\n\n");
                  this.lyL = localStringBuilder.toString();
                  localObject1 = this.lyL;
                  GMTrace.o(2364379496448L, 17616);
                  return (String)localObject1;
                }
              }
              localObject1 = null;
            }
          }
        }
        else
        {
          localObject1 = null;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */