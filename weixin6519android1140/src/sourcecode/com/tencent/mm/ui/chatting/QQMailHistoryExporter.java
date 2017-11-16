package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.a.it.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.b;
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
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class QQMailHistoryExporter
{
  private static final char[] iGu;
  private static final String[] iGv;
  private static final String wGH;
  private Context context;
  private x eMY;
  private float gbV;
  private String wGF;
  private List<au> wuG;
  
  static
  {
    GMTrace.i(2172448145408L, 16186);
    wGH = "<img id=\"%d:%d\" src=\"%s\" height=\"100\" onclick=\"" + com.tencent.mm.pluginsdk.ui.tools.s.eL("weixin://img_onclick/", "this.id + '@@' + this.src") + "\"></img>";
    iGu = new char[] { 60, 62, 34, 39, 38, 10 };
    iGv = new String[] { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "<br />" };
    GMTrace.o(2172448145408L, 16186);
  }
  
  public QQMailHistoryExporter(Context paramContext, List<au> paramList, x paramx)
  {
    GMTrace.i(2171777056768L, 16181);
    this.wGF = null;
    this.eMY = null;
    this.gbV = 1.0F;
    this.context = paramContext;
    this.wuG = paramList;
    this.eMY = paramx;
    GMTrace.o(2171777056768L, 16181);
  }
  
  private static String Sw(String paramString)
  {
    GMTrace.i(2171642839040L, 16180);
    if (paramString == null)
    {
      GMTrace.o(2171642839040L, 16180);
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int n = paramString.length();
    int i = 0;
    if (i < n)
    {
      char c = paramString.charAt(i);
      int m = 1;
      int j = iGu.length - 1;
      for (;;)
      {
        int k = m;
        if (j >= 0)
        {
          if (iGu[j] == c)
          {
            localStringBuffer.append(iGv[j]);
            k = 0;
          }
        }
        else
        {
          if (k != 0) {
            localStringBuffer.append(c);
          }
          i += 1;
          break;
        }
        j -= 1;
      }
    }
    paramString = localStringBuffer.toString();
    GMTrace.o(2171642839040L, 16180);
    return paramString;
  }
  
  private String aF(au paramau)
  {
    GMTrace.i(2172179709952L, 16184);
    String str = null;
    if (!this.eMY.field_username.endsWith("@chatroom")) {
      str = r.fs(paramau.field_talker);
    }
    for (;;)
    {
      if (paramau.field_isSend == 1)
      {
        w.i("MicroMsg.QQMailHistoryExporter", "isSend");
        str = q.zG();
      }
      long l = paramau.field_createTime;
      paramau = new SimpleDateFormat("HH:mm").format(new Date(l));
      Object localObject = new StringBuilder("");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("  ");
      ((StringBuilder)localObject).append(paramau);
      paramau = ((StringBuilder)localObject).toString();
      GMTrace.o(2172179709952L, 16184);
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
    GMTrace.i(2172045492224L, 16183);
    Object localObject;
    if (!this.eMY.field_username.endsWith("@chatroom"))
    {
      str1 = this.context.getString(R.l.dXu);
      localObject = this.eMY.vj();
      at.AR();
      str1 = String.format(str1, new Object[] { localObject, com.tencent.mm.y.c.xh().get(4, null) });
      GMTrace.o(2172045492224L, 16183);
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
  
  private static String fb(long paramLong)
  {
    GMTrace.i(2172313927680L, 16185);
    String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date(paramLong));
    GMTrace.o(2172313927680L, 16185);
    return str;
  }
  
  public final String cew()
  {
    GMTrace.i(2171911274496L, 16182);
    w.i("MicroMsg.QQMailHistoryExporter", "selectItems.size = %d", new Object[] { Integer.valueOf(this.wuG.size()) });
    if (com.tencent.mm.br.a.ed(this.context)) {
      this.gbV = com.tencent.mm.br.a.dZ(this.context);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<div id=\"history\">\n");
    localStringBuilder.append(String.format("<p style=\"font-size:%fem;\">Dear:</p> <br> <p style=\"text-indent:2em; font-size:%fem;\">%s</p> <br>", new Object[] { Float.valueOf(this.gbV), Float.valueOf(this.gbV), cex() }));
    Iterator localIterator = this.wuG.iterator();
    au localau;
    label203:
    Object localObject1;
    if (localIterator.hasNext())
    {
      localau = (au)localIterator.next();
      if (this.wGF == null)
      {
        this.wGF = fb(localau.field_createTime);
        localStringBuilder.append(String.format("<p style=\"text-align:center; font-size:%fem;\"><span style=\"color:#b8b8b8;\">—————  %s  —————</span></p>\n \n", new Object[] { Float.valueOf(this.gbV), this.wGF }));
        if (!localau.bTF()) {
          break label518;
        }
        if (!localau.bTF()) {
          break label512;
        }
        if (localau.field_isSend != 1) {
          break label364;
        }
        localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.gbV), aF(localau), Float.valueOf(this.gbV), Sw(localau.field_content) });
      }
    }
    for (;;)
    {
      localStringBuilder.append((String)localObject1);
      break;
      localObject1 = fb(localau.field_createTime);
      if (((String)localObject1).equals(this.wGF)) {
        break label203;
      }
      this.wGF = ((String)localObject1);
      localStringBuilder.append("<br>");
      localStringBuilder.append(String.format("<p style=\"text-align:center; font-size:%fem;\"><span style=\"color:#b8b8b8;\">—————  %s  —————</span></p>\n \n", new Object[] { Float.valueOf(this.gbV), this.wGF }));
      break label203;
      label364:
      if (!this.eMY.field_username.endsWith("@chatroom"))
      {
        localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.gbV), aF(localau), Float.valueOf(this.gbV), Sw(localau.field_content) });
      }
      else
      {
        int i = bc.gO(localau.field_content);
        if (i != -1)
        {
          localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.gbV), aF(localau), Float.valueOf(this.gbV), Sw(localau.field_content.substring(i + 1).trim()) });
          continue;
          label512:
          localObject1 = null;
          continue;
          label518:
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
              w.d("MicroMsg.QQMailHistoryExporter", "hdPath[%s]", new Object[] { localObject1 });
              if (!bg.nm((String)localObject1))
              {
                localObject2 = "file://" + (String)localObject1;
                localObject1 = String.format(wGH, new Object[] { Long.valueOf(localau.field_msgId), Long.valueOf(localau.field_msgSvrId), localObject2, localObject1 });
              }
            }
            for (localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.gbV), aF(localau), Float.valueOf(this.gbV), localObject1 });; localObject1 = null)
            {
              localStringBuilder.append((String)localObject1);
              break;
            }
          }
          localObject1 = null;
          if (localau.bTu()) {
            localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.dnE) });
          }
          for (;;)
          {
            w.d("MicroMsg.QQMailHistoryExporter", "formatOtherMsg, msgStr = %s", new Object[] { localObject1 });
            localStringBuilder.append(String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.gbV), aF(localau), Float.valueOf(this.gbV), localObject1 }));
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
              com.tencent.mm.sdk.b.a.vgX.m((b)localObject1);
              localObject1 = String.format("[%s]", new Object[] { ((it)localObject1).eMq.eMs });
            }
            else
            {
              if (localau.aCp())
              {
                localObject2 = localau.field_content;
                localObject1 = localObject2;
                if (this.eMY.field_username.endsWith("@chatroom"))
                {
                  w.d("MicroMsg.QQMailHistoryExporter", "chatroom msg, parse it");
                  i = bc.gO(localau.field_content);
                  localObject1 = localObject2;
                  if (i != -1) {
                    localObject1 = localau.field_content.substring(i + 1).trim();
                  }
                }
                localObject2 = f.a.eS(bg.Sx((String)localObject1));
                if (localObject2 == null)
                {
                  w.w("MicroMsg.QQMailHistoryExporter", "appmsg content is null");
                  localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.dnu) });
                  continue;
                }
                f localf = g.aP(((f.a)localObject2).appId, true);
                if ((localf == null) || (bg.nm(localf.field_appName)))
                {
                  localObject1 = ((f.a)localObject2).appName;
                  label1109:
                  localObject1 = g.a(this.context, localf, (String)localObject1);
                  if (localau.field_type != 16777265) {
                    break label1170;
                  }
                  i = 1;
                }
                for (;;)
                {
                  if (i != 0)
                  {
                    if (bg.nm((String)localObject1))
                    {
                      localObject1 = Sw(((f.a)localObject2).title);
                      break;
                      localObject1 = localf.field_appName;
                      break label1109;
                      label1170:
                      i = 0;
                      continue;
                    }
                    localObject1 = String.format("[%s: %s]", new Object[] { localObject1, Sw(((f.a)localObject2).title) });
                    break;
                  }
                }
                if (localau.bTK())
                {
                  localObject1 = dp.a(localau, (f.a)localObject2);
                  if (!bg.nm((String)localObject1))
                  {
                    localObject2 = "file://" + (String)localObject1;
                    localObject1 = String.format(wGH, new Object[] { Long.valueOf(localau.field_msgId), Long.valueOf(localau.field_msgSvrId), localObject2, localObject1 });
                  }
                }
                else
                {
                  switch (((f.a)localObject2).type)
                  {
                  case 7: 
                  default: 
                    localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.dnu) });
                    break;
                  case 3: 
                    if (bg.nm(((f.a)localObject2).description))
                    {
                      localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(R.l.dnA), Sw(((f.a)localObject2).title) });
                      continue;
                    }
                    localObject1 = String.format("[%s: %s-%s]", new Object[] { this.context.getString(R.l.dnA), Sw(((f.a)localObject2).title), Sw(((f.a)localObject2).description) });
                    break;
                  case 8: 
                    localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.dnx) });
                    break;
                  case 6: 
                    if (bg.nm(((f.a)localObject2).description))
                    {
                      localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(R.l.dny), Sw(((f.a)localObject2).title) });
                      continue;
                    }
                    localObject1 = String.format("[%s: %s-%s(%s)]", new Object[] { this.context.getString(R.l.dny), Sw(((f.a)localObject2).title), Sw(((f.a)localObject2).description), this.context.getString(R.l.dnv) });
                    break;
                  case 2: 
                    localObject1 = dp.a(localau, (f.a)localObject2);
                    if (bg.nm((String)localObject1)) {
                      break label2003;
                    }
                    localObject2 = "file://" + (String)localObject1;
                    localObject1 = String.format(wGH, new Object[] { Long.valueOf(localau.field_msgId), Long.valueOf(localau.field_msgSvrId), localObject2, localObject1 });
                    break;
                  case 1: 
                    if (bg.nm((String)localObject1))
                    {
                      localObject1 = Sw(((f.a)localObject2).title);
                      continue;
                    }
                    localObject1 = String.format("[%s: %s]", new Object[] { localObject1, Sw(((f.a)localObject2).title) });
                    break;
                  case 4: 
                  case 5: 
                    localObject1 = String.format("[%s: %s]", new Object[] { Sw(((f.a)localObject2).title), Sw(((f.a)localObject2).url) });
                    break;
                  }
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
                  localObject1 = String.format("[%s: %s(%s)]", new Object[] { localObject1, new File(com.tencent.mm.modelvideo.s.mk(localau.field_imgPath)).getName(), this.context.getString(R.l.dnv) });
                  continue;
                }
                if ((!localau.bTI()) && (!localau.bTJ())) {
                  continue;
                }
                localObject1 = String.format("[%s]", new Object[] { this.context.getString(R.l.dnx) });
                continue;
                localStringBuilder.append("\n</div>\n");
                localObject1 = localStringBuilder.toString();
                GMTrace.o(2171911274496L, 16182);
                return (String)localObject1;
              }
              label2003:
              localObject1 = "";
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
  
  public static class ImageSpanData
    implements Parcelable
  {
    public static final Parcelable.Creator<ImageSpanData> CREATOR;
    int endPos;
    int gsM;
    String path;
    public int thumbnail;
    
    static
    {
      GMTrace.i(2210297544704L, 16468);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(2210297544704L, 16468);
    }
    
    public ImageSpanData()
    {
      GMTrace.i(2209760673792L, 16464);
      this.thumbnail = 0;
      GMTrace.o(2209760673792L, 16464);
    }
    
    public int describeContents()
    {
      GMTrace.i(2209894891520L, 16465);
      GMTrace.o(2209894891520L, 16465);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(2210029109248L, 16466);
      paramParcel.writeInt(this.gsM);
      paramParcel.writeInt(this.endPos);
      paramParcel.writeString(this.path);
      paramParcel.writeInt(this.thumbnail);
      GMTrace.o(2210029109248L, 16466);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\QQMailHistoryExporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */