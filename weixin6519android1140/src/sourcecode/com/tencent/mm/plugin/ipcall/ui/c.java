package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
  extends o<com.tencent.mm.plugin.ipcall.a.g.c>
  implements d.a
{
  static HashMap<String, com.tencent.mm.plugin.ipcall.a.g.c> mmO;
  private String htH;
  HashMap<String, Integer> jRG;
  boolean jul;
  private Context mContext;
  private d mnR;
  private HashMap<Long, com.tencent.mm.plugin.ipcall.a.g.c> mnS;
  private HashSet<String> mnT;
  private boolean mnU;
  private View.OnClickListener mnV;
  an mnt;
  
  static
  {
    GMTrace.i(11725797588992L, 87364);
    mmO = null;
    GMTrace.o(11725797588992L, 87364);
  }
  
  public c(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(11723247452160L, 87345);
    this.mnS = new HashMap();
    this.jRG = new HashMap();
    this.mnT = new HashSet();
    this.mnU = false;
    this.jul = false;
    this.mnV = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11730629427200L, 87400);
        if ((paramAnonymousView.getTag() instanceof Integer))
        {
          int i = ((Integer)paramAnonymousView.getTag()).intValue();
          paramAnonymousView = c.this.pr(i);
          Intent localIntent = new Intent(c.a(c.this), IPCallUserProfileUI.class);
          localIntent.putExtra("IPCallProfileUI_contactid", paramAnonymousView.field_contactId);
          localIntent.putExtra("IPCallProfileUI_systemUsername", paramAnonymousView.field_systemAddressBookUsername);
          localIntent.putExtra("IPCallProfileUI_wechatUsername", paramAnonymousView.field_wechatUsername);
          c.b(c.this).startActivity(localIntent);
        }
        GMTrace.o(11730629427200L, 87400);
      }
    };
    this.mnt = new an();
    lb(true);
    this.mContext = paramContext;
    this.mnR = new d(paramContext);
    n.Dh().a(this);
    GMTrace.o(11723247452160L, 87345);
  }
  
  private static String Av(String paramString)
  {
    GMTrace.i(11724589629440L, 87355);
    if (bg.nm(paramString))
    {
      GMTrace.o(11724589629440L, 87355);
      return "";
    }
    if (paramString.startsWith(b.jRE))
    {
      GMTrace.o(11724589629440L, 87355);
      return "#";
    }
    paramString = paramString.toUpperCase().substring(0, 1);
    GMTrace.o(11724589629440L, 87355);
    return paramString;
  }
  
  private static String a(com.tencent.mm.plugin.ipcall.a.g.c paramc, String paramString)
  {
    GMTrace.i(11724455411712L, 87354);
    if ((paramc != null) && (paramc.mmP != null))
    {
      paramc = paramc.mmP.iterator();
      while (paramc.hasNext())
      {
        String str = (String)paramc.next();
        if (str.contains(paramString))
        {
          GMTrace.o(11724455411712L, 87354);
          return str;
        }
      }
    }
    GMTrace.o(11724455411712L, 87354);
    return null;
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(11723784323072L, 87349);
    this.htH = paramString;
    if (bg.nm(this.htH)) {}
    for (this.mnU = false;; this.mnU = true)
    {
      this.vKt.clear();
      QF();
      notifyDataSetChanged();
      GMTrace.o(11723784323072L, 87349);
      return;
    }
  }
  
  public final void QF()
  {
    Object localObject2 = null;
    GMTrace.i(11723918540800L, 87350);
    Object localObject1;
    if (!this.mnU) {
      localObject1 = i.aIu().fTZ.query("IPCallAddressItem", com.tencent.mm.plugin.ipcall.a.g.d.mmQ, null, null, null, null, "upper(sortKey) asc");
    }
    for (;;)
    {
      if (localObject1 != null) {
        ((Cursor)localObject1).moveToFirst();
      }
      setCursor((Cursor)localObject1);
      if (getCursor() != null)
      {
        Cursor localCursor = getCursor();
        try
        {
          if (!localCursor.moveToFirst()) {
            break label231;
          }
          int i = 0;
          localObject1 = localObject2;
          label83:
          if (localCursor.isAfterLast()) {
            break label231;
          }
          localObject2 = new com.tencent.mm.plugin.ipcall.a.g.c();
          ((com.tencent.mm.plugin.ipcall.a.g.c)localObject2).b(localCursor);
          localObject2 = Av(((com.tencent.mm.plugin.ipcall.a.g.c)localObject2).field_sortKey);
          if (i == 0) {
            this.jRG.put(localObject2, Integer.valueOf(i));
          }
          for (;;)
          {
            i += 1;
            localCursor.moveToNext();
            localObject1 = localObject2;
            break label83;
            this.jul = true;
            localObject1 = i.aIu().Am(this.htH);
            this.jul = false;
            break;
            if ((localObject1 != null) && (!((String)localObject2).equals(localObject1))) {
              this.jRG.put(localObject2, Integer.valueOf(i));
            }
          }
          GMTrace.o(11723918540800L, 87350);
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.IPCallAddressAdapter", "initSectionPosMap error: %s", new Object[] { localException.getMessage() });
        }
      }
    }
    return;
    label231:
    GMTrace.o(11723918540800L, 87350);
  }
  
  protected final void QG()
  {
    GMTrace.i(11724186976256L, 87352);
    super.aJe();
    QF();
    GMTrace.o(11724186976256L, 87352);
  }
  
  public final int aJd()
  {
    GMTrace.i(11723515887616L, 87347);
    int i = super.getCount();
    GMTrace.o(11723515887616L, 87347);
    return i;
  }
  
  public final void aJe()
  {
    GMTrace.i(11724052758528L, 87351);
    super.aJe();
    GMTrace.o(11724052758528L, 87351);
  }
  
  public final int getCount()
  {
    GMTrace.i(11723381669888L, 87346);
    int i = super.getCount();
    GMTrace.o(11723381669888L, 87346);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(11724723847168L, 87356);
    paramInt = super.getItemViewType(paramInt);
    GMTrace.o(11724723847168L, 87356);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11724321193984L, 87353);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.context).inflate(R.i.cAo, paramViewGroup, false);
      paramView = new b();
      paramView.moh = localView.findViewById(R.h.bIK);
      paramView.moi = localView.findViewById(R.h.buE);
      paramView.hqg = ((ImageView)localView.findViewById(R.h.bfq));
      paramView.iBg = ((TextView)localView.findViewById(R.h.bQX));
      paramView.mnZ = ((TextView)localView.findViewById(R.h.bTd));
      paramView.moa = ((LinearLayout)localView.findViewById(R.h.bXi));
      paramView.mob = ((TextView)localView.findViewById(R.h.bXj));
      paramView.moc = ((TextView)localView.findViewById(R.h.bXk));
      paramView.mod = ((TextView)localView.findViewById(R.h.bdd));
      paramView.moe = ((TextView)localView.findViewById(R.h.bcX));
      paramView.mof = ((ImageView)localView.findViewById(R.h.bcY));
      paramView.mog = localView.findViewById(R.h.bIM);
      paramView.mog.setClickable(true);
      paramView.moj = ((ImageView)localView.findViewById(R.h.divider));
      localView.setTag(paramView);
    }
    paramViewGroup = (b)localView.getTag();
    paramViewGroup.mog.setClickable(true);
    paramViewGroup.mog.setTag(Integer.valueOf(paramInt));
    paramViewGroup.moj.setVisibility(8);
    int j;
    int i;
    if (oR(paramInt))
    {
      paramViewGroup.iBg.setVisibility(8);
      paramViewGroup.mnZ.setVisibility(8);
      paramViewGroup.moa.setVisibility(8);
      paramViewGroup.hqg.setVisibility(8);
      paramViewGroup.hqg.setTag(null);
      paramViewGroup.moe.setVisibility(8);
      paramViewGroup.mod.setVisibility(8);
      paramViewGroup.mof.setVisibility(8);
      j = 1;
      i = j;
      if (pr(paramInt + 1) != null)
      {
        i = j;
        if (pr(paramInt) != null)
        {
          i = j;
          if (!Av(pr(paramInt + 1).field_sortKey).equals(Av(pr(paramInt).field_sortKey))) {
            i = 0;
          }
        }
      }
      if ((paramInt + 1 != getCount()) && (i != 0)) {
        break label1588;
      }
      paramViewGroup.moi.setVisibility(8);
    }
    for (;;)
    {
      GMTrace.o(11724321193984L, 87353);
      return localView;
      com.tencent.mm.plugin.ipcall.a.g.c localc = pr(paramInt);
      if (localc != null)
      {
        if (bg.nm(localc.field_systemAddressBookUsername)) {
          break label1435;
        }
        paramViewGroup.iBg.setVisibility(0);
        if (!this.mnU) {
          break label924;
        }
        paramViewGroup.mnZ.setVisibility(0);
        paramView = (FrameLayout.LayoutParams)paramViewGroup.moh.getLayoutParams();
        paramView.height = ((int)paramViewGroup.mnZ.getContext().getResources().getDimension(R.f.aQW));
        paramViewGroup.moh.setLayoutParams(paramView);
        paramView = (RelativeLayout.LayoutParams)paramViewGroup.hqg.getLayoutParams();
        paramView.height = ((int)paramViewGroup.hqg.getContext().getResources().getDimension(R.f.aQT));
        paramView.width = ((int)paramViewGroup.hqg.getContext().getResources().getDimension(R.f.aQT));
        paramViewGroup.hqg.setLayoutParams(paramView);
        label607:
        if ((!this.mnU) || (localc.mmP != null) || (mmO == null) || (!mmO.containsKey(localc.field_contactId))) {
          break label1037;
        }
        localc.mmP = ((com.tencent.mm.plugin.ipcall.a.g.c)mmO.get(localc.field_contactId)).mmP;
        label664:
        if ((bg.nm(this.htH)) || ((!bg.l(this.htH.charAt(0))) && (!this.htH.startsWith("+")))) {
          break label1088;
        }
        paramView = com.tencent.mm.az.e.a(a(localc, this.htH), an.RZ(this.htH));
        paramViewGroup.mnZ.setText(paramView);
        paramView = com.tencent.mm.az.e.a(localc.field_systemAddressBookUsername, this.htH);
        paramViewGroup.iBg.setText(paramView);
        label750:
        paramView = paramViewGroup.hqg;
        if (paramView != null)
        {
          paramView.setVisibility(0);
          paramView.setTag(null);
          paramView.setImageResource(R.g.aXu);
          if (localc != null)
          {
            if ((bg.nm(localc.field_contactId)) || (bg.nm(localc.field_wechatUsername))) {
              break label1456;
            }
            this.mnR.a(localc.field_contactId, localc.field_wechatUsername, paramView);
            label821:
            if (!bg.nm(localc.field_wechatUsername)) {
              this.mnT.add(localc.field_wechatUsername);
            }
          }
        }
        paramViewGroup.moa.setVisibility(8);
        paramView = Av(localc.field_sortKey);
        if (paramInt != 0) {
          break label1510;
        }
        paramViewGroup.mod.setVisibility(0);
        paramViewGroup.mod.setText(paramView);
        paramViewGroup.moe.setVisibility(8);
      }
      for (;;)
      {
        paramViewGroup.mog.setVisibility(8);
        paramViewGroup.mof.setVisibility(8);
        paramViewGroup.mof.setOnClickListener(this.mnV);
        break;
        label924:
        paramViewGroup.mnZ.setVisibility(8);
        paramView = (FrameLayout.LayoutParams)paramViewGroup.moh.getLayoutParams();
        paramView.height = ((int)paramViewGroup.mnZ.getContext().getResources().getDimension(R.f.aQV));
        paramViewGroup.moh.setLayoutParams(paramView);
        paramView = (RelativeLayout.LayoutParams)paramViewGroup.hqg.getLayoutParams();
        paramView.height = ((int)paramViewGroup.hqg.getContext().getResources().getDimension(R.f.aQU));
        paramView.width = ((int)paramViewGroup.hqg.getContext().getResources().getDimension(R.f.aQU));
        paramViewGroup.hqg.setLayoutParams(paramView);
        break label607;
        label1037:
        if ((!this.mnU) || (localc.mmP != null) || ((mmO != null) && (!mmO.containsKey(localc.field_contactId)))) {
          break label664;
        }
        localc.mmP = b.Aj(localc.field_contactId);
        break label664;
        label1088:
        if ((!bg.nm(this.htH)) && (!bg.l(this.htH.charAt(0))))
        {
          String str1 = localc.field_systemAddressBookUsername;
          Object localObject = localc.field_systemAddressBookUsername;
          paramView = this.htH;
          if ((bg.nm(paramView)) || (bg.nm((String)localObject))) {
            paramView = "";
          }
          label1407:
          for (;;)
          {
            paramView = com.tencent.mm.az.e.a(str1, paramView);
            paramViewGroup.iBg.setText(paramView);
            paramViewGroup.mnZ.setText(a(localc, this.htH));
            break;
            if ((!bg.Sg(paramView)) && (bg.Sh(paramView)))
            {
              ArrayList localArrayList = new ArrayList();
              i = 0;
              String str2;
              while (i < ((String)localObject).length())
              {
                str2 = ((String)localObject).substring(i, i + 1);
                localArrayList.add(new a(com.tencent.mm.platformtools.c.nb(str2), str2));
                i += 1;
              }
              i = 2;
              while (i <= ((String)localObject).length())
              {
                j = 0;
                while (j <= ((String)localObject).length() - i)
                {
                  str2 = ((String)localObject).substring(j, j + i);
                  localArrayList.add(new a(com.tencent.mm.platformtools.c.nb(str2), str2));
                  j += 1;
                }
                i += 1;
              }
              i = 0;
              for (;;)
              {
                if (i >= localArrayList.size()) {
                  break label1407;
                }
                localObject = (a)localArrayList.get(i);
                if (((a)localObject).mnX.contains(paramView))
                {
                  paramView = ((a)localObject).mnY;
                  break;
                }
                i += 1;
              }
            }
          }
        }
        if (!bg.nm(this.htH)) {
          break label750;
        }
        paramViewGroup.iBg.setText(localc.field_systemAddressBookUsername);
        break label750;
        label1435:
        paramViewGroup.iBg.setVisibility(8);
        paramViewGroup.mnZ.setVisibility(8);
        break label750;
        label1456:
        if (!bg.nm(localc.field_contactId))
        {
          this.mnR.b(localc.field_contactId, paramView);
          break label821;
        }
        if (bg.nm(localc.field_wechatUsername)) {
          break label821;
        }
        this.mnR.c(localc.field_wechatUsername, paramView);
        break label821;
        label1510:
        if (!Av(pr(paramInt - 1).field_sortKey).equals(paramView))
        {
          paramViewGroup.mod.setVisibility(0);
          paramViewGroup.mod.setText(paramView);
          paramViewGroup.moe.setVisibility(8);
        }
        else
        {
          paramViewGroup.mod.setVisibility(8);
          paramViewGroup.mod.setText("");
          paramViewGroup.moe.setVisibility(8);
        }
      }
      label1588:
      paramViewGroup.moi.setVisibility(0);
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(11724858064896L, 87357);
    int i = super.getViewTypeCount();
    GMTrace.o(11724858064896L, 87357);
    return i;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(11724992282624L, 87358);
    if (this.mnT.contains(paramString)) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11673989545984L, 86978);
          c.this.notifyDataSetChanged();
          GMTrace.o(11673989545984L, 86978);
        }
      });
    }
    GMTrace.o(11724992282624L, 87358);
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(11725126500352L, 87359);
    this.mnS.clear();
    super.notifyDataSetChanged();
    GMTrace.o(11725126500352L, 87359);
  }
  
  public final com.tencent.mm.plugin.ipcall.a.g.c pr(int paramInt)
  {
    GMTrace.i(11723650105344L, 87348);
    com.tencent.mm.plugin.ipcall.a.g.c localc = (com.tencent.mm.plugin.ipcall.a.g.c)super.getItem(paramInt);
    GMTrace.o(11723650105344L, 87348);
    return localc;
  }
  
  final class a
  {
    String mnX;
    String mnY;
    
    public a(String paramString1, String paramString2)
    {
      GMTrace.i(11690766761984L, 87103);
      this.mnY = paramString2;
      this.mnX = paramString1;
      GMTrace.o(11690766761984L, 87103);
    }
  }
  
  private final class b
  {
    ImageView hqg;
    TextView iBg;
    TextView mnZ;
    LinearLayout moa;
    TextView mob;
    TextView moc;
    TextView mod;
    TextView moe;
    ImageView mof;
    View mog;
    View moh;
    View moi;
    ImageView moj;
    
    public b()
    {
      GMTrace.i(11697477648384L, 87153);
      GMTrace.o(11697477648384L, 87153);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */