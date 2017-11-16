package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.plugin.selectcontact.a.d;
import com.tencent.mm.plugin.selectcontact.a.e;
import com.tencent.mm.plugin.selectcontact.a.f;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.List;
import java.util.regex.Pattern;

public class d
  extends a
{
  private static final Pattern hqA;
  public i hWl;
  public CharSequence hqB;
  public CharSequence hqC;
  public String[] lxa;
  public String username;
  private b wUQ;
  private a wUR;
  
  static
  {
    GMTrace.i(1773284622336L, 13212);
    hqA = Pattern.compile(",");
    GMTrace.o(1773284622336L, 13212);
  }
  
  public d(int paramInt)
  {
    super(2, paramInt);
    GMTrace.i(1772747751424L, 13208);
    this.wUQ = new b();
    this.wUR = new a();
    GMTrace.o(1772747751424L, 13208);
  }
  
  public a.b PV()
  {
    GMTrace.i(1773016186880L, 13210);
    b localb = this.wUQ;
    GMTrace.o(1773016186880L, 13210);
    return localb;
  }
  
  public a.a PW()
  {
    GMTrace.i(1773150404608L, 13211);
    a locala = this.wUR;
    GMTrace.o(1773150404608L, 13211);
    return locala;
  }
  
  public final void bz(Context paramContext)
  {
    GMTrace.i(1772881969152L, 13209);
    int i;
    if (this.hWl != null) {
      if ((this.lxa != null) && (this.lxa.length > 0))
      {
        i = 1;
        j = i;
        if (this.iBi == null)
        {
          com.tencent.mm.kernel.h.xz();
          this.iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Tz(this.hWl.lwH);
          j = i;
          if (this.iBi == null)
          {
            com.tencent.mm.kernel.h.xz();
            this.iBi = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(this.hWl.lwH);
          }
        }
      }
    }
    for (int j = i;; j = 0)
    {
      if (this.iBi != null) {
        break label167;
      }
      w.i("MicroMsg.ContactDataItem", "filling dataItem Occur Error Contact is null, position=%d", new Object[] { Integer.valueOf(this.position) });
      GMTrace.o(1772881969152L, 13209);
      return;
      i = 0;
      break;
    }
    label167:
    this.username = this.iBi.field_username;
    Object localObject2;
    Object localObject4;
    String[] arrayOfString;
    Resources localResources;
    Object localObject1;
    boolean bool1;
    boolean bool2;
    Object localObject3;
    if (j != 0)
    {
      localObject2 = this.hWl;
      localObject4 = this.iBi;
      arrayOfString = this.lxa;
      localResources = paramContext.getResources();
      if (localObject4 == null) {
        break label1015;
      }
      localObject1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).a((x)localObject4, ((af)localObject4).field_username);
      switch (((i)localObject2).gRk)
      {
      case 8: 
      case 9: 
      case 10: 
      case 12: 
      case 13: 
      case 14: 
      default: 
        bool1 = false;
        bool2 = false;
        j = 0;
        localObject2 = null;
        localObject4 = null;
        i = 0;
        localObject3 = localObject1;
        localObject1 = localObject4;
      }
    }
    for (;;)
    {
      localObject4 = bg.g(arrayOfString);
      if (j != 0)
      {
        w.d("MicroMsg.ContactDataItem", "highlight first line");
        this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, (CharSequence)localObject3, com.tencent.mm.br.a.V(paramContext, a.c.aQF));
        this.hqB = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.hqB, this.eQb, (List)localObject4, bool2, bool1)).lAJ;
        label410:
        if (i == 0) {
          break label877;
        }
        w.d("MicroMsg.ContactDataItem", "highlight second line");
        this.hqC = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, (CharSequence)localObject1, com.tencent.mm.br.a.V(paramContext, a.c.aQo));
        this.hqC = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.hqC, this.eQb, (List)localObject4, bool2, bool1)).lAJ;
        label465:
        if ((!bg.nm((String)localObject2)) && (this.hqC != null)) {
          this.hqC = TextUtils.concat(new CharSequence[] { localObject2, this.hqC });
        }
        GMTrace.o(1772881969152L, 13209);
        return;
        bool1 = true;
        label516:
        bool2 = true;
        label519:
        j = 1;
        localObject2 = null;
        localObject3 = localObject1;
        localObject1 = null;
        i = 0;
        continue;
        bool1 = true;
      }
      label539:
      for (bool2 = true;; bool2 = false)
      {
        localObject4 = ((af)localObject4).field_nickname;
        localObject2 = localResources.getString(a.h.dWi);
        localObject3 = localObject1;
        localObject1 = localObject4;
        j = 0;
        i = 1;
        break;
        localObject4 = ((af)localObject4).fjt;
        localObject2 = localResources.getString(a.h.dWf);
        bool2 = false;
        j = 0;
        localObject3 = localObject1;
        localObject1 = localObject4;
        i = 1;
        bool1 = false;
        break;
        localObject3 = ((x)localObject4).qQ();
        localObject2 = localObject3;
        if (bg.nm((String)localObject3)) {
          localObject2 = ((af)localObject4).field_username;
        }
        localObject3 = localResources.getString(a.h.dWm);
        bool2 = false;
        j = 0;
        localObject4 = localObject1;
        localObject1 = localObject2;
        i = 1;
        bool1 = false;
        localObject2 = localObject3;
        localObject3 = localObject4;
        break;
        localObject2 = ((i)localObject2).content;
        if (!bg.nm((String)localObject2))
        {
          localObject4 = ((String)localObject2).split("​");
          j = localObject4.length;
          i = 0;
          label708:
          if (i < j)
          {
            localObject3 = localObject4[i];
            if (((String)localObject3).startsWith(this.eQb)) {
              localObject2 = localObject3;
            }
          }
        }
        for (;;)
        {
          localObject3 = localResources.getString(a.h.dWh);
          bool2 = false;
          j = 0;
          localObject4 = localObject1;
          localObject1 = localObject2;
          i = 1;
          bool1 = false;
          localObject2 = localObject3;
          localObject3 = localObject4;
          break;
          i += 1;
          break label708;
          localObject4 = ((i)localObject2).content;
          localObject2 = localResources.getString(a.h.oFC);
          bool2 = false;
          j = 0;
          localObject3 = localObject1;
          localObject1 = localObject4;
          i = 1;
          bool1 = false;
          break;
          localObject4 = ((i)localObject2).lxi;
          localObject2 = localResources.getString(a.h.dWl);
          bool2 = false;
          j = 0;
          localObject3 = localObject1;
          localObject1 = localObject4;
          i = 1;
          bool1 = false;
          break;
          this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, (CharSequence)localObject3, com.tencent.mm.br.a.V(paramContext, a.c.aQF));
          break label410;
          label877:
          this.hqC = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, (CharSequence)localObject1, com.tencent.mm.br.a.V(paramContext, a.c.aQo));
          break label465;
          if (bg.nm(this.eCK)) {}
          for (localObject1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).c(this.iBi);; localObject1 = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).F(this.iBi.field_username, this.eCK))
          {
            this.hqB = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, (CharSequence)localObject1, com.tencent.mm.br.a.V(paramContext, a.c.aQF));
            GMTrace.o(1772881969152L, 13209);
            return;
          }
        }
        bool1 = false;
        break label516;
        bool1 = false;
        bool2 = false;
        break label519;
        bool1 = false;
        break label539;
        bool1 = false;
      }
      label1015:
      bool1 = false;
      bool2 = false;
      j = 0;
      localObject1 = null;
      localObject2 = null;
      localObject3 = null;
      i = 0;
    }
  }
  
  public class a
    extends a.a
  {
    public View hqF;
    public ImageView hqG;
    public TextView hqH;
    public TextView hqI;
    public CheckBox hqJ;
    public CheckBox wUS;
    
    public a()
    {
      super();
      GMTrace.i(1766036865024L, 13158);
      GMTrace.o(1766036865024L, 13158);
    }
  }
  
  public class b
    extends a.b
  {
    public b()
    {
      super();
      GMTrace.i(1768587001856L, 13177);
      GMTrace.o(1768587001856L, 13177);
    }
    
    public final boolean PX()
    {
      GMTrace.i(1768989655040L, 13180);
      if (d.this.hWl != null) {
        ((l)com.tencent.mm.kernel.h.j(l.class)).updateTopHitsRank(d.this.eQb, d.this.hWl, 1);
      }
      GMTrace.o(1768989655040L, 13180);
      return false;
    }
    
    public View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(1768721219584L, 13178);
      if (com.tencent.mm.br.a.ed(paramContext)) {}
      for (paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFu, paramViewGroup, false);; paramContext = LayoutInflater.from(paramContext).inflate(a.f.oFt, paramViewGroup, false))
      {
        paramViewGroup = (d.a)d.this.PW();
        paramViewGroup.hqG = ((ImageView)paramContext.findViewById(a.e.bfq));
        paramViewGroup.hqH = ((TextView)paramContext.findViewById(a.e.chT));
        paramViewGroup.hqI = ((TextView)paramContext.findViewById(a.e.bti));
        paramViewGroup.hqF = paramContext.findViewById(a.e.cbB);
        paramViewGroup.hqJ = ((CheckBox)paramContext.findViewById(a.e.cbs));
        paramViewGroup.wUS = ((CheckBox)paramContext.findViewById(a.e.oFo));
        paramContext.setTag(paramViewGroup);
        GMTrace.o(1768721219584L, 13178);
        return paramContext;
      }
    }
    
    public void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
    {
      GMTrace.i(1768855437312L, 13179);
      parama = (d.a)parama;
      parama1 = (d)parama1;
      if ((parama1.username != null) && (parama1.username.length() > 0))
      {
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.hqG, parama1.username);
        e.a(parama1.hqB, parama.hqH);
        e.a(parama1.hqC, parama.hqI);
        if (!d.this.wSC) {
          break label216;
        }
        parama.hqJ.setBackgroundResource(a.d.oFe);
        if (!paramBoolean1) {
          break label196;
        }
        parama.hqJ.setChecked(true);
        parama.hqJ.setEnabled(false);
        label112:
        parama.hqJ.setVisibility(0);
        label120:
        if (!d.this.jug) {
          break label347;
        }
        parama.hqF.setBackgroundResource(a.d.aVP);
      }
      for (;;)
      {
        if (parama1.iBi.field_deleteFlag == 1)
        {
          parama.hqI.setVisibility(0);
          parama.hqI.setText(paramContext.getString(a.h.oFF));
        }
        GMTrace.o(1768855437312L, 13179);
        return;
        parama.hqG.setImageResource(a.d.aVS);
        break;
        label196:
        parama.hqJ.setChecked(paramBoolean2);
        parama.hqJ.setEnabled(true);
        break label112;
        label216:
        if (d.this.wUH)
        {
          parama.hqJ.setBackgroundResource(a.d.aZz);
          if (paramBoolean1)
          {
            parama.hqJ.setChecked(true);
            parama.hqJ.setEnabled(false);
          }
          for (;;)
          {
            parama.hqJ.setVisibility(0);
            break;
            parama.hqJ.setChecked(paramBoolean2);
            parama.hqJ.setEnabled(true);
          }
        }
        if (d.this.wSD)
        {
          parama.hqJ.setVisibility(8);
          parama.wUS.setChecked(paramBoolean2);
          parama.wUS.setEnabled(true);
          parama.wUS.setVisibility(0);
          break label120;
        }
        parama.hqJ.setVisibility(8);
        break label120;
        label347:
        parama.hqF.setBackgroundResource(a.d.aVO);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */