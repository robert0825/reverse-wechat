package com.tencent.mm.plugin.favorite.ui.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.fts.d.f.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tm;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.y.ab.a;
import com.tencent.mm.y.ab.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  extends com.tencent.mm.plugin.fts.d.a.a
{
  private static final ae handler;
  private static final Pattern ljv;
  public i hWl;
  public List<String> hWm;
  public String ied;
  public int ljA;
  private b ljB;
  a ljC;
  public CharSequence ljw;
  public CharSequence ljx;
  public CharSequence ljy;
  public String ljz;
  
  static
  {
    GMTrace.i(6439229718528L, 47976);
    ljv = Pattern.compile("['\r\n' | '\n']+");
    handler = new ae(Looper.getMainLooper());
    GMTrace.o(6439229718528L, 47976);
  }
  
  public a(int paramInt)
  {
    super(7, paramInt);
    GMTrace.i(6438290194432L, 47969);
    this.ljB = new b();
    this.ljC = new a();
    GMTrace.o(6438290194432L, 47969);
  }
  
  private static String a(x paramx, boolean paramBoolean)
  {
    GMTrace.i(6438692847616L, 47972);
    if ((paramBoolean) && (!bg.nm(paramx.field_conRemark))) {}
    for (String str1 = paramx.field_conRemark;; str1 = paramx.field_nickname)
    {
      String str2 = str1;
      if (bg.nm(str1)) {
        str2 = paramx.field_username;
      }
      GMTrace.o(6438692847616L, 47972);
      return str2;
    }
  }
  
  public static void a(TextView paramTextView1, TextView paramTextView2, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    GMTrace.i(6438155976704L, 47968);
    if (e.a(paramCharSequence1, paramTextView1))
    {
      if (e.a(paramCharSequence2, paramTextView2))
      {
        paramTextView1.setMaxLines(1);
        paramTextView2.setMaxLines(1);
        GMTrace.o(6438155976704L, 47968);
        return;
      }
      paramTextView1.setMaxLines(2);
      GMTrace.o(6438155976704L, 47968);
      return;
    }
    if (e.a(paramCharSequence2, paramTextView2)) {
      paramTextView2.setMaxLines(2);
    }
    GMTrace.o(6438155976704L, 47968);
  }
  
  private static String c(Context paramContext, x paramx)
  {
    GMTrace.i(6438827065344L, 47973);
    String str2 = paramx.field_conRemark;
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = paramx.field_nickname;
    }
    paramx = str1;
    if (bg.nm(str1)) {
      paramx = paramContext.getString(R.l.dyp);
    }
    GMTrace.o(6438827065344L, 47973);
    return paramx;
  }
  
  private static String g(List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(6438961283072L, 47974);
    StringBuffer localStringBuffer = new StringBuffer();
    paramList2 = paramList2.iterator();
    while (paramList2.hasNext())
    {
      String str1 = ((String)paramList2.next()).toLowerCase();
      Iterator localIterator = paramList1.iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (str2.toLowerCase().contains(str1))
        {
          localStringBuffer.append(str2);
          localStringBuffer.append(" ");
        }
      }
    }
    localStringBuffer.trimToSize();
    paramList1 = localStringBuffer.toString();
    GMTrace.o(6438961283072L, 47974);
    return paramList1;
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vu()
  {
    GMTrace.i(16649709158400L, 124050);
    b localb = this.ljB;
    GMTrace.o(16649709158400L, 124050);
    return localb;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a.a Vv()
  {
    GMTrace.i(18032554409984L, 134353);
    a locala = this.ljC;
    GMTrace.o(18032554409984L, 134353);
    return locala;
  }
  
  public final int Vx()
  {
    GMTrace.i(6439095500800L, 47975);
    int i = this.hWl.lxn;
    GMTrace.o(6439095500800L, 47975);
    return i;
  }
  
  public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16649574940672L, 124049);
    long l = this.hWl.lxe;
    parama = new ft();
    parama.eIo.type = 9;
    parama.eIo.eDp = l;
    com.tencent.mm.sdk.b.a.vgX.m(parama);
    tm localtm = parama.eIp.eIz;
    l = this.hWl.lxe;
    parama = new ft();
    parama.eIo.type = 11;
    parama.eIo.eDp = l;
    parama.eIo.handler = handler;
    com.tencent.mm.sdk.b.a.vgX.m(parama);
    this.ljz = bg.aq(parama.eIp.eIy, "");
    this.ied = bg.aq(parama.eIp.thumbUrl, "");
    Object localObject1 = this.hWl;
    Object localObject2 = this.hWm;
    float f = f.a.lzA * 2;
    Object localObject3 = localtm.eRx;
    parama = "";
    label308:
    int i;
    switch (localtm.type)
    {
    case 5: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    case 15: 
    default: 
      parama = localtm.title;
      switch (((i)localObject1).gRk)
      {
      default: 
        this.ljw = parama;
        localObject2 = this.hWl;
        localObject1 = this.hWm;
        localObject3 = localtm.eRx;
        parama = "";
        i = -1;
        switch (localtm.type)
        {
        case 3: 
        case 4: 
        case 8: 
        case 9: 
        case 13: 
        default: 
          label416:
          parama = "";
          label420:
          switch (((i)localObject2).gRk)
          {
          default: 
            localObject1 = "";
            paramVarArgs = parama;
            parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
            label478:
            localObject1 = parama;
            if (i != -1)
            {
              localObject1 = parama;
              if (!bg.nm(paramVarArgs)) {
                localObject1 = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(i), parama });
              }
            }
            this.ljx = ((CharSequence)localObject1);
            localObject3 = this.hWl;
            localObject2 = this.hWm;
            paramVarArgs = localtm.eMI;
            parama = localtm.ulm;
            if (bg.nm(paramVarArgs))
            {
              localObject1 = null;
              paramVarArgs = parama;
              parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
            }
            break;
          }
          break;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      if (bg.nm(paramVarArgs))
      {
        paramContext = new SpannableString("");
        this.ljy = paramContext;
      }
      switch (localtm.type)
      {
      case 7: 
      default: 
        i = R.k.cMF;
        this.ljA = i;
        GMTrace.o(16649574940672L, 124049);
        return;
        parama = ljv.matcher(localtm.desc).replaceAll(" ");
        break;
        parama = paramContext.getResources().getString(R.l.dWv);
        break;
        if (!bg.nm(((tt)localObject3).hLO))
        {
          paramVarArgs = ((tt)localObject3).hLO;
          parama = paramVarArgs;
          if (((tt)localObject3).ukH == null) {
            break;
          }
          parama = paramVarArgs;
          if (bg.nm(((tt)localObject3).ukH.eQm)) {
            break;
          }
          parama = paramVarArgs + "(" + ((tt)localObject3).ukH.eQm + ")";
          break;
        }
        if (((tt)localObject3).ukH != null)
        {
          paramVarArgs = ((tt)localObject3).ukH.eQm;
          parama = paramVarArgs;
          if (!bg.nm(paramVarArgs)) {
            break;
          }
          parama = ((tt)localObject3).ukH.label;
          break;
        }
        parama = localtm.desc;
        break;
        parama = paramContext.getResources().getString(R.l.dWz);
        break;
        parama = paramContext.getResources().getString(R.l.dWA);
        break;
        if (((tt)localObject3).ukL == null) {
          break;
        }
        parama = ((tt)localObject3).ukL.title;
        break;
        parama = new StringBuffer();
        paramVarArgs = ((tt)localObject3).ulB.iterator();
        while (paramVarArgs.hasNext())
        {
          localObject3 = com.tencent.mm.pluginsdk.model.c.o((th)paramVarArgs.next());
          if (!bg.nm((String)localObject3))
          {
            parama.append((String)localObject3);
            parama.append(" ");
          }
        }
        paramVarArgs = ljv.matcher(parama.toString()).replaceAll(" ");
        parama = paramVarArgs;
        if (!bg.nm(paramVarArgs)) {
          break;
        }
        parama = paramContext.getResources().getString(R.l.dWx);
        break;
        paramVarArgs = localtm.title;
        parama = paramVarArgs;
        if (bg.nm(localtm.desc)) {
          break;
        }
        parama = paramVarArgs + "-" + localtm.desc;
        break;
        parama = paramContext.getResources().getString(R.l.dWy);
        break;
        parama = f.b(com.tencent.mm.plugin.fts.d.b.a.a(parama, this.eQb, (List)localObject2, f, d.b.lzw)).lAJ;
        break label308;
        if (bg.nm(localtm.appId)) {
          break label420;
        }
        parama = ab.a.gmV.m(paramContext, localtm.appId);
        break label420;
        parama = localtm.title;
        break label420;
        if (((tt)localObject3).ukH == null) {
          break label420;
        }
        paramVarArgs = ((tt)localObject3).ukH.label;
        parama = paramVarArgs;
        if (!bg.nm(((tt)localObject3).hLO)) {
          break label420;
        }
        parama = paramVarArgs;
        if (!bg.nm(((tt)localObject3).ukH.eQm)) {
          break label420;
        }
        break label416;
        if (((tt)localObject3).ukL == null) {
          break label420;
        }
        parama = ((tt)localObject3).ukL.desc;
        break label420;
        parama = "";
        break label420;
        i = R.l.dWu;
        localObject1 = f.b(com.tencent.mm.plugin.fts.d.b.a.b(parama, (List)localObject1)).lAJ;
        paramVarArgs = parama;
        parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
        break label478;
        i = R.l.dWw;
        paramVarArgs = g(localtm.uln, (List)localObject1);
        parama = f.b(com.tencent.mm.plugin.fts.d.b.a.b(paramVarArgs, (List)localObject1)).lAJ;
        break label478;
        localObject1 = f.b(com.tencent.mm.plugin.fts.d.b.a.b(parama, (List)localObject1)).lAJ;
        paramVarArgs = parama;
        parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
        break label478;
        at.AR();
        localObject1 = com.tencent.mm.y.c.yK().TE(paramVarArgs);
        ((x)localObject1).setUsername(paramVarArgs);
        if ((s.eb(paramVarArgs)) && (!bg.nm(parama)))
        {
          at.AR();
          paramVarArgs = com.tencent.mm.y.c.yK().TE(parama);
          paramVarArgs.setUsername(parama);
        }
      case 8: 
      case 5: 
      case 3: 
      case 4: 
      case 6: 
        label637:
        for (parama = paramVarArgs;; parama = null)
        {
          boolean bool2 = false;
          boolean bool1 = false;
          label1385:
          label1423:
          label1462:
          boolean bool3;
          switch (((i)localObject3).gRk)
          {
          case 15: 
          default: 
            i = 0;
            bool2 = false;
            bool1 = false;
            if (parama != null)
            {
              parama = a(parama, true) + "-" + c(paramContext, (x)localObject1);
              parama = h.c(paramContext, parama, com.tencent.mm.br.a.V(paramContext, R.f.aQo));
              if (i == 0) {
                break label1684;
              }
              parama = f.b(com.tencent.mm.plugin.fts.d.b.a.a(parama, this.eQb, (List)localObject2, bool1, bool2)).lAJ;
              paramContext = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(R.l.dWb), parama });
            }
            break;
          case 14: 
            bool1 = true;
          case 13: 
            bool3 = true;
            bool2 = bool1;
          case 11: 
          case 18: 
          case 10: 
          case 17: 
          case 9: 
          case 16: 
          case 12: 
            for (bool1 = bool3;; bool1 = false)
            {
              if (parama != null) {}
              for (parama = a(parama, false) + "-" + c(paramContext, (x)localObject1);; parama = a((x)localObject1, false))
              {
                i = 1;
                break;
              }
              bool2 = true;
              for (bool1 = true;; bool1 = false)
              {
                i = 1;
                break label1385;
                if (s.eb(((af)localObject1).field_username))
                {
                  parama = c(paramContext, (x)localObject1);
                  break label1423;
                }
                parama = a((x)localObject1, true);
                break label1423;
                if ((localtm.eRx.ulB == null) || (localtm.eRx.ulB.size() <= 0)) {
                  break;
                }
                i = com.tencent.mm.pluginsdk.c.NV(((th)localtm.eRx.ulB.get(0)).ujI);
                break label637;
                i = R.k.cJr;
                break label637;
                i = R.k.cJq;
                break label637;
                i = R.k.cJo;
                break label637;
                i = R.k.cJc;
                break label637;
                label1684:
                break label1462;
                bool2 = false;
              }
              bool2 = false;
            }
          }
        }
      }
    }
  }
  
  public final class a
    extends com.tencent.mm.plugin.fts.d.a.a.a
  {
    public View hqF;
    public TextView hqH;
    public MMImageView ljD;
    public TextView ljE;
    public TextView ljF;
    
    public a()
    {
      super();
      GMTrace.i(6436276928512L, 47954);
      GMTrace.o(6436276928512L, 47954);
    }
  }
  
  public final class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(6435068968960L, 47945);
      GMTrace.o(6435068968960L, 47945);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(6435203186688L, 47946);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cxK, paramViewGroup, false);
      paramViewGroup = (a.a)a.this.ljC;
      paramViewGroup.ljD = ((MMImageView)paramContext.findViewById(R.h.bfq));
      paramViewGroup.hqH = ((TextView)paramContext.findViewById(R.h.chT));
      paramViewGroup.ljE = ((TextView)paramContext.findViewById(R.h.bcm));
      paramViewGroup.ljF = ((TextView)paramContext.findViewById(R.h.cfT));
      paramViewGroup.hqF = paramContext.findViewById(R.h.cay);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(6435203186688L, 47946);
      return paramContext;
    }
    
    public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16650648682496L, 124057);
      parama = (a.a)parama;
      paramVarArgs = (a)paramVarArgs;
      ck(parama.hqF);
      e.a(paramContext, parama.ljD, paramVarArgs.ied, paramVarArgs.ljz, paramVarArgs.ljA, parama.ljD.getMeasuredWidth(), parama.ljD.getMeasuredHeight());
      a.a(parama.hqH, parama.ljE, a.this.ljw, a.this.ljx);
      e.a(a.this.ljy, parama.ljF);
      GMTrace.o(16650648682496L, 124057);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16650782900224L, 124058);
      paramVarArgs = (a)paramVarArgs;
      ft localft = new ft();
      localft.eIo.type = 10;
      localft.eIo.eDp = paramVarArgs.hWl.lxe;
      localft.eIo.context = paramContext;
      com.tencent.mm.sdk.b.a.vgX.m(localft);
      GMTrace.o(16650782900224L, 124058);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */