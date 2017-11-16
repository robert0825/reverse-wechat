package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.bu.a.e;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.AddressView;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.f.b;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a
  extends com.tencent.mm.ui.f<String, com.tencent.mm.storage.f>
  implements m.b
{
  public static final ColorStateList mvB;
  public static final ColorStateList mvC;
  b gCY;
  private String htH;
  protected List<String> iVA;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.d jpT;
  private boolean jul;
  View.OnClickListener lgu;
  protected MMSlideDelView.e nuM;
  StringBuilder sb;
  private int type;
  LinkedList<View> wPA;
  boolean wPB;
  HashMap<View, ViewStub> wPC;
  private SparseArray<String> wPD;
  private SparseArray<Integer> wPE;
  private HashSet<String> wPF;
  public HashMap<String, com.tencent.mm.storage.f> wPk;
  protected String wPl;
  protected String wPm;
  private List<Object> wPn;
  private List<String> wPo;
  private int wPp;
  protected int[] wPq;
  String[] wPr;
  protected AddressUI.a wPs;
  private Set<Integer> wPt;
  private int wPu;
  private boolean wPv;
  a wPw;
  private boolean wPx;
  boolean wPy;
  private String wPz;
  private String[] woC;
  
  static
  {
    GMTrace.i(1744696246272L, 12999);
    mvB = com.tencent.mm.br.a.U(ab.getContext(), R.e.aOq);
    mvC = com.tencent.mm.br.a.U(ab.getContext(), R.e.aOa);
    GMTrace.o(1744696246272L, 12999);
  }
  
  public a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    super(paramContext);
    GMTrace.i(1741340803072L, 12974);
    this.wPl = null;
    this.wPm = null;
    this.iVA = null;
    this.wPp = 0;
    this.htH = "";
    this.woC = null;
    this.jpT = MMSlideDelView.cah();
    this.wPt = new HashSet();
    this.wPu = 0;
    this.wPv = true;
    this.gCY = null;
    this.jul = false;
    this.wPx = false;
    this.wPy = false;
    this.wPA = new LinkedList();
    this.wPC = new HashMap();
    this.lgu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1839588179968L, 13706);
        w.v("MicroMsg.AddressAdapter", "on delView clicked");
        a.this.jpT.aJq();
        if (a.this.nuM != null) {
          a.this.nuM.aV(((ViewStub)a.a(a.this).get(paramAnonymousView)).getTag());
        }
        GMTrace.o(1839588179968L, 13706);
      }
    };
    this.sb = new StringBuilder(32);
    this.wPD = new SparseArray();
    this.wPE = new SparseArray();
    this.wPF = new HashSet();
    this.wPk = new HashMap();
    this.context = paramContext;
    this.wPl = paramString1;
    this.wPm = paramString2;
    this.type = paramInt;
    this.wPx = true;
    this.wPn = new LinkedList();
    this.wPo = new LinkedList();
    this.wPz = q.zE();
    this.TAG = "MiscroMsg.AddressDrawWithCacheAdapter";
    GMTrace.o(1741340803072L, 12974);
  }
  
  private int a(com.tencent.mm.storage.f paramf, int paramInt)
  {
    GMTrace.i(1743085633536L, 12987);
    if (paramInt < this.wPu)
    {
      GMTrace.o(1743085633536L, 12987);
      return 32;
    }
    if (paramf == null)
    {
      w.e("MicroMsg.AddressAdapter", "contact is null, position:%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(1743085633536L, 12987);
      return -1;
    }
    paramInt = paramf.field_showHead;
    GMTrace.o(1743085633536L, 12987);
    return paramInt;
  }
  
  private String b(com.tencent.mm.storage.f paramf, int paramInt)
  {
    GMTrace.i(1743219851264L, 12988);
    if (paramInt < this.wPu)
    {
      paramf = getString(R.l.cQW);
      GMTrace.o(1743219851264L, 12988);
      return paramf;
    }
    if (paramf.field_showHead == 31)
    {
      GMTrace.o(1743219851264L, 12988);
      return "";
    }
    if (paramf.field_showHead == 123)
    {
      GMTrace.o(1743219851264L, 12988);
      return "#";
    }
    if (paramf.field_showHead == 33)
    {
      paramf = getString(R.l.cQK);
      GMTrace.o(1743219851264L, 12988);
      return paramf;
    }
    if (paramf.field_showHead == 43)
    {
      paramf = getString(R.l.dTd);
      GMTrace.o(1743219851264L, 12988);
      return paramf;
    }
    if (paramf.field_showHead == 32)
    {
      paramf = getString(R.l.cQW);
      GMTrace.o(1743219851264L, 12988);
      return paramf;
    }
    String str = (String)this.wPD.get(paramf.field_showHead);
    if (str != null)
    {
      GMTrace.o(1743219851264L, 12988);
      return str;
    }
    str = String.valueOf((char)paramf.field_showHead);
    this.wPD.put(paramf.field_showHead, str);
    GMTrace.o(1743219851264L, 12988);
    return str;
  }
  
  private boolean cgd()
  {
    GMTrace.i(1742414544896L, 12982);
    if ((this.wPl.equals("@micromsg.qq.com")) || (this.wPl.equals("@all.contact.without.chatroom")))
    {
      GMTrace.o(1742414544896L, 12982);
      return true;
    }
    GMTrace.o(1742414544896L, 12982);
    return false;
  }
  
  private String getString(int paramInt)
  {
    GMTrace.i(1743488286720L, 12990);
    String str2 = (String)this.wPD.get(paramInt);
    String str1 = str2;
    if (str2 == null)
    {
      str1 = this.context.getString(paramInt);
      this.wPD.put(paramInt, str1);
    }
    GMTrace.o(1743488286720L, 12990);
    return str1;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(1744159375360L, 12995);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.d("MicroMsg.AddressAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(1744159375360L, 12995);
      return;
    }
    at.AR();
    if (paramm == c.yK()) {
      if ((!s.fB((String)paramObject)) && (!this.wPF.contains((String)paramObject)))
      {
        super.n((String)paramObject, 2);
        if ((this.wPy) && (this.wPs != null))
        {
          this.wPs.wQb = true;
          w.d("MicroMsg.AddressAdapter", "ADDRESS onNotifyChange");
          GMTrace.o(1744159375360L, 12995);
        }
      }
      else
      {
        w.d("MicroMsg.AddressAdapter", "newcursor is stranger ，return");
      }
    }
    GMTrace.o(1744159375360L, 12995);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(1741877673984L, 12978);
    this.jpR = paramc;
    GMTrace.o(1741877673984L, 12978);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(1741743456256L, 12977);
    this.nuM = parame;
    GMTrace.o(1741743456256L, 12977);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(1741609238528L, 12976);
    this.jpQ = paramf;
    GMTrace.o(1741609238528L, 12976);
  }
  
  public final SparseArray<String>[] a(HashSet<f.b<String, com.tencent.mm.storage.f>> paramHashSet, SparseArray<String>[] paramArrayOfSparseArray)
  {
    GMTrace.i(1743890939904L, 12993);
    paramHashSet = new SparseArray[paramArrayOfSparseArray.length];
    paramArrayOfSparseArray = new LinkedList();
    paramArrayOfSparseArray.add("weixin");
    long l = System.currentTimeMillis();
    at.AR();
    paramArrayOfSparseArray = c.yK().b(this.wPl, this.wPm, this.iVA, paramArrayOfSparseArray, cgd(), this.wPx);
    int i;
    if ((paramArrayOfSparseArray instanceof e))
    {
      com.tencent.mm.bu.a.d[] arrayOfd = ((e)paramArrayOfSparseArray).vDY;
      int k = arrayOfd.length;
      i = 0;
      while (i < k)
      {
        int j = 0;
        arrayOfd[i].AI(5000);
        paramHashSet[i] = new SparseArray();
        while (arrayOfd[i].moveToNext())
        {
          paramHashSet[i].put(j, arrayOfd[i].getString(0));
          j += 1;
        }
        i += 1;
      }
      this.wPu = arrayOfd[0].getCount();
    }
    for (;;)
    {
      paramArrayOfSparseArray.close();
      w.d("MicroMsg.AddressAdapter", "refreshPosistion last :" + (System.currentTimeMillis() - l));
      GMTrace.o(1743890939904L, 12993);
      return paramHashSet;
      i = 0;
      paramHashSet[0] = new SparseArray();
      while (paramArrayOfSparseArray.moveToNext())
      {
        paramHashSet[0].put(i, paramArrayOfSparseArray.getString(0));
        i += 1;
      }
    }
  }
  
  public final ArrayList<com.tencent.mm.storage.f> ah(ArrayList<String> paramArrayList)
  {
    GMTrace.i(1743756722176L, 12992);
    long l = System.currentTimeMillis();
    Object localObject = new ArrayList();
    int i = 0;
    while (i < paramArrayList.size())
    {
      ((List)localObject).add((String)paramArrayList.get(i));
      i += 1;
    }
    paramArrayList = new ArrayList(((List)localObject).size());
    at.AR();
    localObject = c.yK().ck((List)localObject);
    while (((Cursor)localObject).moveToNext())
    {
      com.tencent.mm.storage.f localf = new com.tencent.mm.storage.f();
      localf.b((Cursor)localObject);
      paramArrayList.add(localf);
    }
    ((Cursor)localObject).close();
    w.d("MicroMsg.AddressAdapter", "rebulidAllChangeData :" + (System.currentTimeMillis() - l));
    GMTrace.o(1743756722176L, 12992);
    return paramArrayList;
  }
  
  public final com.tencent.mm.bu.a.d<String> bWu()
  {
    GMTrace.i(16855867588608L, 125586);
    long l = System.currentTimeMillis();
    Object localObject = new LinkedList();
    ((LinkedList)localObject).add("weixin");
    at.AR();
    localObject = c.yK().a(this.wPl, this.wPm, this.iVA, (List)localObject, cgd(), this.wPx);
    w.d("MicroMsg.AddressAdapter", "kevin setCursor : " + (System.currentTimeMillis() - l));
    localObject = (com.tencent.mm.bu.a.d)localObject;
    GMTrace.o(16855867588608L, 125586);
    return (com.tencent.mm.bu.a.d<String>)localObject;
  }
  
  public final void cS(List<String> paramList)
  {
    GMTrace.i(1742011891712L, 12979);
    if (this.type != 2) {
      paramList.add(q.zE());
    }
    at.AR();
    Object localObject = c.yS().CB("@t.qq.com");
    if (localObject != null) {
      paramList.add(((ay)localObject).name);
    }
    if ((this.type == 3) || (this.type == 5) || (this.type == 4) || (this.type == 1) || (this.type == 0))
    {
      localObject = s.An().iterator();
      while (((Iterator)localObject).hasNext()) {
        paramList.add((String)((Iterator)localObject).next());
      }
    }
    paramList.add("blogapp");
    this.iVA = paramList;
    GMTrace.o(1742011891712L, 12979);
  }
  
  protected final void cge()
  {
    GMTrace.i(1742548762624L, 12983);
    int k = getCount();
    if (k == 0)
    {
      GMTrace.o(1742548762624L, 12983);
      return;
    }
    this.wPu = bWt();
    if (this.woC != null)
    {
      this.wPq = s.a(this.wPl, this.wPm, this.iVA, this.woC);
      this.wPr = s.a(this.wPl, this.wPm, this.woC, this.iVA);
    }
    for (;;)
    {
      this.wPt.clear();
      Object localObject1 = this.wPq;
      int j = localObject1.length;
      int i = 0;
      while (i < j)
      {
        k = localObject1[i];
        this.wPt.add(Integer.valueOf(k - 1));
        i += 1;
      }
      long l;
      if (bVh())
      {
        l = System.currentTimeMillis();
        localObject1 = new HashSet();
        this.wPq = new int[30];
        this.wPr = new String[30];
        j = this.wPu;
        i = 0;
        if (j < k)
        {
          Object localObject2 = (com.tencent.mm.storage.f)AH(j);
          if (localObject2 != null)
          {
            localObject2 = b((com.tencent.mm.storage.f)localObject2, j);
            if (!((HashSet)localObject1).add(localObject2)) {
              break label266;
            }
            this.wPq[i] = (j - this.wPu);
            this.wPr[i] = localObject2;
            i += 1;
          }
          label266:
          for (;;)
          {
            j += 1;
            break;
            w.d("MicroMsg.AddressAdapter", "newCursor getItem is null");
          }
        }
        w.d("MicroMsg.AddressAdapter", "newCursor resetShowHead by Memory : " + (System.currentTimeMillis() - l) + "favourCount : " + this.wPu);
      }
      else
      {
        l = System.currentTimeMillis();
        this.wPq = s.a(this.wPl, this.wPm, this.iVA, this.htH);
        this.wPr = s.a(this.wPl, this.wPm, this.htH, this.iVA);
        w.d("MicroMsg.AddressAdapter", "kevin resetShowHead part1 : " + (System.currentTimeMillis() - l));
      }
    }
    GMTrace.o(1742548762624L, 12983);
  }
  
  public final void cgf()
  {
    GMTrace.i(1742682980352L, 12984);
    this.jpT.aJq();
    GMTrace.o(1742682980352L, 12984);
  }
  
  public final void cgg()
  {
    GMTrace.i(1744025157632L, 12994);
    super.n(null, 1);
    GMTrace.o(1744025157632L, 12994);
  }
  
  public final void da(String paramString, int paramInt)
  {
    GMTrace.i(1740938149888L, 12971);
    if (paramInt == 5) {
      this.wPF.add(paramString);
    }
    super.n(paramString, paramInt);
    GMTrace.o(1740938149888L, 12971);
  }
  
  public final int getCount()
  {
    GMTrace.i(1743354068992L, 12989);
    int i = super.getCount();
    GMTrace.o(1743354068992L, 12989);
    return i;
  }
  
  public final int getPositionForSection(int paramInt)
  {
    GMTrace.i(1742280327168L, 12981);
    int i = paramInt;
    if (this.wPq != null)
    {
      i = paramInt;
      if (paramInt >= 0)
      {
        i = paramInt;
        if (paramInt < this.wPq.length) {
          i = this.wPq[paramInt];
        }
      }
    }
    paramInt = this.wPu;
    GMTrace.o(1742280327168L, 12981);
    return paramInt + i;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int j = -1;
    GMTrace.i(1742951415808L, 12986);
    int i;
    if (!this.wPB)
    {
      i = 0;
      while (i < 8)
      {
        this.wPA.add(v.fb(this.context).inflate(R.i.coV, null));
        i += 1;
      }
      this.wPB = true;
    }
    com.tencent.mm.storage.f localf = (com.tencent.mm.storage.f)AH(paramInt);
    b localb;
    View localView;
    label255:
    label289:
    int k;
    if (paramView == null) {
      if (this.wPA.size() > 0)
      {
        paramView = (View)this.wPA.getFirst();
        this.wPA.removeFirst();
        localb = new b();
        localb.mpk = ((TextView)paramView.findViewById(R.h.brF));
        localb.mpl = ((TextView)paramView.findViewById(R.h.brK));
        localb.mvG = ((AddressView)paramView.findViewById(R.h.bPn));
        localb.wPH = ((TextView)paramView.findViewById(R.h.brC));
        localb.wPI = paramView.findViewById(R.h.brJ);
        paramViewGroup = localb.wPI.getLayoutParams();
        paramViewGroup.height = ((int)(com.tencent.mm.br.a.W(this.context, R.f.aPH) * com.tencent.mm.br.a.ec(this.context)));
        localb.wPI.setLayoutParams(paramViewGroup);
        this.wPs.jNJ.a(localb.mvG);
        paramView.setTag(localb);
        localView = paramView;
        if (localf != null)
        {
          paramView = (com.tencent.mm.storage.f)AH(paramInt - 1);
          paramViewGroup = (com.tencent.mm.storage.f)AH(paramInt + 1);
          if (paramView != null) {
            break label713;
          }
          i = -1;
          k = a(localf, paramInt);
          if (paramViewGroup != null) {
            break label726;
          }
          label302:
          if (!this.wPv) {
            break label786;
          }
          if (paramInt != 0) {
            break label739;
          }
          paramView = b(localf, paramInt);
          if (t.nm(paramView)) {
            break label786;
          }
          localb.mpk.setVisibility(0);
          localb.mpk.setText(paramView);
          label346:
          if ((!this.wPv) || (k == j)) {
            localb.wPI.setBackgroundResource(R.g.aXC);
          }
          com.tencent.mm.pluginsdk.ui.a.b.a(localb.mvG, localf.field_username);
          if (localf.field_verifyFlag == 0) {
            break label823;
          }
          if (ak.a.gmZ == null) {
            break label811;
          }
          paramView = ak.a.gmZ.fs(localf.field_verifyFlag);
          if (paramView == null) {
            break label799;
          }
          paramView = com.tencent.mm.af.m.iX(paramView);
          localb.mvG.setMaskBitmap(paramView);
          label430:
          localb.mvG.updateTextColors();
          paramView = localf.vpn;
          if (paramView != null) {
            break label1037;
          }
        }
      }
    }
    try
    {
      Context localContext = this.context;
      if ((localf.field_conRemark == null) || (localf.field_conRemark.trim().equals(""))) {
        break label835;
      }
      paramView = localf.field_conRemark;
      label484:
      paramViewGroup = localf.field_username;
      if ((paramView == null) || (paramView.length() <= 0)) {
        break label1026;
      }
      label501:
      paramViewGroup = paramView;
      if ("".length() > 0)
      {
        paramViewGroup = paramView;
        if (!"".equals(paramView))
        {
          this.sb.append(paramView);
          this.sb.append("(");
          this.sb.append("");
          this.sb.append(")");
          paramViewGroup = this.sb.toString();
          this.sb.delete(0, this.sb.length());
        }
      }
      paramView = h.c(localContext, paramViewGroup, com.tencent.mm.br.a.V(this.context, R.f.aQF));
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        paramView = null;
      }
    }
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = "";
    }
    localb.mvG.setName(paramViewGroup);
    label622:
    localb.mvG.setDescription(t.nl(localf.field_remarkDesc));
    localb.mvG.updatePositionFlag();
    paramViewGroup = localb.mvG;
    if (localb.mvG.getNickName() == null) {}
    for (paramView = "";; paramView = localb.mvG.getNickName().toString())
    {
      paramViewGroup.setContentDescription(paramView);
      GMTrace.o(1742951415808L, 12986);
      return localView;
      paramView = View.inflate(this.context, R.i.coV, null);
      break;
      localb = (b)paramView.getTag();
      localView = paramView;
      break label255;
      label713:
      i = a(paramView, paramInt - 1);
      break label289;
      label726:
      j = a(paramViewGroup, paramInt + 1);
      break label302;
      label739:
      if ((paramInt > 0) && (k != i))
      {
        paramView = b(localf, paramInt);
        if (!t.nm(paramView))
        {
          localb.mpk.setVisibility(0);
          localb.mpk.setText(paramView);
          break label346;
        }
      }
      label786:
      localb.mpk.setVisibility(8);
      break label346;
      label799:
      localb.mvG.setMaskBitmap(null);
      break label430;
      label811:
      localb.mvG.setMaskBitmap(null);
      break label430;
      label823:
      localb.mvG.setMaskBitmap(null);
      break label430;
      label835:
      paramViewGroup = com.tencent.mm.l.a.eg(localf.field_username);
      paramView = paramViewGroup;
      if (paramViewGroup != null) {
        break label484;
      }
      if ((localf.field_nickname == null) || (localf.field_nickname.length() <= 0))
      {
        paramViewGroup = localf.field_alias;
        paramView = paramViewGroup;
        if (!bg.nm(paramViewGroup)) {
          break label484;
        }
        paramView = localf.field_username;
        if (paramView == null) {
          paramViewGroup = null;
        }
        for (;;)
        {
          if (paramViewGroup != null)
          {
            paramView = paramViewGroup;
            if (paramViewGroup.length() != 0) {
              break;
            }
          }
          paramView = localf.field_username;
          break;
          if (paramView.toLowerCase().endsWith("@t.qq.com"))
          {
            paramViewGroup = "@" + paramView.replace("@t.qq.com", "");
          }
          else
          {
            paramViewGroup = paramView;
            if (paramView.toLowerCase().endsWith("@qqim"))
            {
              paramViewGroup = paramView.replace("@qqim", "");
              long l = Long.valueOf(paramViewGroup).longValue();
              if (l < 0L) {
                paramViewGroup = new o(l).toString();
              }
            }
          }
        }
      }
      paramView = localf.field_nickname;
      break label484;
      label1026:
      paramView = paramViewGroup;
      break label501;
      label1037:
      localb.mvG.setName(paramView);
      break label622;
    }
  }
  
  public final void l(Fragment paramFragment)
  {
    GMTrace.i(1741475020800L, 12975);
    this.wPs = ((AddressUI.a)paramFragment);
    GMTrace.o(1741475020800L, 12975);
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(1741206585344L, 12973);
    this.wPz = q.zE();
    if (this.wPq == null) {
      cge();
    }
    if (getCount() == 0)
    {
      GMTrace.o(1741206585344L, 12973);
      return;
    }
    this.wPu = bWt();
    w.i("MicroMsg.AddressAdapter", "newcursor favourCount %d", new Object[] { Integer.valueOf(this.wPu) });
    super.notifyDataSetChanged();
    GMTrace.o(1741206585344L, 12973);
  }
  
  public final void pause()
  {
    GMTrace.i(1741072367616L, 12972);
    this.wPF.clear();
    super.pause();
    GMTrace.o(1741072367616L, 12972);
  }
  
  public static abstract interface a {}
  
  protected static final class b
  {
    public TextView mpk;
    public TextView mpl;
    public AddressView mvG;
    public TextView wPH;
    public View wPI;
    
    public b()
    {
      GMTrace.i(1716376305664L, 12788);
      GMTrace.o(1716376305664L, 12788);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */