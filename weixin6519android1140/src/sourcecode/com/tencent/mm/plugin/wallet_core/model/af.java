package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.wallet_core.ui.e.b;
import com.tencent.mm.wallet_core.ui.e.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class af
{
  public int mRetryCount;
  public Bankcard qUy;
  ArrayList<Bankcard> qWC;
  ArrayList<Bankcard> qWD;
  public long rjA;
  private String rjB;
  public int rjC;
  public String rjD;
  public String rjE;
  private ArrayList<Bankcard> rjr;
  public ae rjs;
  public Bankcard rjt;
  ad rju;
  public j rjv;
  public b rjw;
  private List<c> rjx;
  public Bankcard rjy;
  public long rjz;
  
  public af()
  {
    GMTrace.i(6892617203712L, 51354);
    this.rjr = new ArrayList();
    this.qWC = new ArrayList();
    this.qWD = new ArrayList();
    this.rjs = null;
    this.rjt = null;
    this.qUy = null;
    this.rju = null;
    this.rjv = null;
    this.rjw = null;
    this.rjx = new LinkedList();
    this.rjy = null;
    this.rjz = bg.Pu();
    this.rjA = -1L;
    this.rjB = "";
    this.rjC = 10000;
    this.mRetryCount = 0;
    this.rjD = "";
    this.rjE = "";
    bzb();
    GMTrace.o(6892617203712L, 51354);
  }
  
  public static void Kk(String paramString)
  {
    GMTrace.i(6895838429184L, 51378);
    if (!bg.nm(paramString))
    {
      h.xz();
      h.xy().xh().set(196612, paramString);
    }
    GMTrace.o(6895838429184L, 51378);
  }
  
  public static boolean bL(List<Bankcard> paramList)
  {
    GMTrace.i(6895301558272L, 51374);
    if (paramList.size() == 0)
    {
      GMTrace.o(6895301558272L, 51374);
      return false;
    }
    h.xz();
    Object localObject = (String)h.xy().xh().get(196659, null);
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      GMTrace.o(6895301558272L, 51374);
      return true;
    }
    localObject = ((String)localObject).split("&");
    if ((localObject == null) || (localObject.length == 0))
    {
      GMTrace.o(6895301558272L, 51374);
      return true;
    }
    int i = 0;
    int j = 0;
    if (i < localObject.length)
    {
      CharSequence localCharSequence = localObject[i];
      int k = j;
      int m;
      if (!TextUtils.isEmpty(localCharSequence)) {
        m = 0;
      }
      for (;;)
      {
        k = j;
        if (m < paramList.size())
        {
          Bankcard localBankcard = (Bankcard)paramList.get(m);
          if ((localBankcard != null) && (localCharSequence.equals(localBankcard.field_bankcardType))) {
            k = j + 1;
          }
        }
        else
        {
          i += 1;
          j = k;
          break;
        }
        m += 1;
      }
    }
    if (j < paramList.size())
    {
      GMTrace.o(6895301558272L, 51374);
      return true;
    }
    GMTrace.o(6895301558272L, 51374);
    return false;
  }
  
  private void bzg()
  {
    GMTrace.i(6896241082368L, 51381);
    w.i("MicroMsg.WalletUserInfoManger", "recordDataState()");
    if (this.rjs == null) {
      w.i("MicroMsg.WalletUserInfoManger", "userInfo == null");
    }
    if (this.qWC == null)
    {
      w.i("MicroMsg.WalletUserInfoManger", "bankcards == null");
      if (this.qWD != null) {
        break label158;
      }
      w.i("MicroMsg.WalletUserInfoManger", "virtualBankcards == null");
      label57:
      if (this.qUy != null) {
        break label208;
      }
      w.i("MicroMsg.WalletUserInfoManger", "balance == null");
      label71:
      if (this.rjt != null) {
        break label218;
      }
      w.i("MicroMsg.WalletUserInfoManger", "historyBankcard == null");
    }
    for (;;)
    {
      if (this.rjv != null) {
        break label228;
      }
      w.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo == null");
      GMTrace.o(6896241082368L, 51381);
      return;
      if (this.qWC.size() == 0)
      {
        w.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == 0");
        break;
      }
      w.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == " + this.qWC.size());
      break;
      label158:
      if (this.qWD.size() == 0)
      {
        w.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == 0");
        break label57;
      }
      w.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == " + this.qWD.size());
      break label57;
      label208:
      w.i("MicroMsg.WalletUserInfoManger", "balance != null");
      break label71;
      label218:
      w.i("MicroMsg.WalletUserInfoManger", "historyBankcard != null");
    }
    label228:
    w.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo != null");
    GMTrace.o(6896241082368L, 51381);
  }
  
  public final boolean Kj(String paramString)
  {
    GMTrace.i(6895435776000L, 51375);
    if (bg.nm(paramString))
    {
      GMTrace.o(6895435776000L, 51375);
      return false;
    }
    Iterator localIterator;
    Bankcard localBankcard;
    if (this.qWC != null)
    {
      localIterator = this.qWC.iterator();
      while (localIterator.hasNext())
      {
        localBankcard = (Bankcard)localIterator.next();
        if ((paramString.equals(localBankcard.field_bankcardType)) && (localBankcard.byc()))
        {
          GMTrace.o(6895435776000L, 51375);
          return false;
        }
      }
    }
    if (this.qWD != null)
    {
      localIterator = this.qWD.iterator();
      while (localIterator.hasNext())
      {
        localBankcard = (Bankcard)localIterator.next();
        if ((paramString.equals(localBankcard.field_bankcardType)) && (localBankcard.field_bankcardState == 0))
        {
          GMTrace.o(6895435776000L, 51375);
          return false;
        }
      }
    }
    GMTrace.o(6895435776000L, 51375);
    return true;
  }
  
  public final Bankcard a(ArrayList<Bankcard> paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6895972646912L, 51379);
    Object localObject = paramArrayList;
    if (paramArrayList == null) {
      localObject = this.qWC;
    }
    paramArrayList = paramString;
    if (bg.nm(paramString))
    {
      h.xz();
      paramArrayList = (String)h.xy().xh().get(196612, null);
    }
    if ((paramBoolean1) && (this.qUy != null))
    {
      if (byT())
      {
        paramArrayList = this.qUy;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
      if ((paramArrayList != null) && (paramArrayList.equals(this.qUy.field_bindSerial)))
      {
        paramArrayList = this.qUy;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
      if ((this.rjy != null) && (this.rjs != null) && (this.rjs.field_lqt_state == 1) && (paramArrayList != null) && (paramArrayList.equals(this.rjy.field_bindSerial)))
      {
        paramArrayList = this.rjy;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
      if ((!byP()) && ((localObject == null) || (((ArrayList)localObject).size() == 0)))
      {
        paramArrayList = this.qUy;
        GMTrace.o(6895972646912L, 51379);
        return paramArrayList;
      }
    }
    if ((localObject == null) || (((ArrayList)localObject).size() <= 0))
    {
      w.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
      GMTrace.o(6895972646912L, 51379);
      return null;
    }
    if ((((ArrayList)localObject).size() == 1) && (paramBoolean2))
    {
      w.e("MicroMsg.WalletUserInfoManger", "only one bankcard!");
      paramArrayList = (Bankcard)((ArrayList)localObject).get(0);
      GMTrace.o(6895972646912L, 51379);
      return paramArrayList;
    }
    w.i("MicroMsg.WalletUserInfoManger", "have multiple bankcards!");
    if (!bg.nm(paramArrayList))
    {
      paramString = ((ArrayList)localObject).iterator();
      while (paramString.hasNext())
      {
        Bankcard localBankcard = (Bankcard)paramString.next();
        if ((localBankcard != null) && (paramArrayList.equals(localBankcard.field_bindSerial)))
        {
          GMTrace.o(6895972646912L, 51379);
          return localBankcard;
        }
      }
    }
    if (paramBoolean2)
    {
      paramArrayList = (Bankcard)((ArrayList)localObject).get(0);
      GMTrace.o(6895972646912L, 51379);
      return paramArrayList;
    }
    GMTrace.o(6895972646912L, 51379);
    return null;
  }
  
  public final void a(ae paramae, ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2, Bankcard paramBankcard1, Bankcard paramBankcard2, j paramj, b paramb, Bankcard paramBankcard3, int paramInt1, int paramInt2, List<c> paramList)
  {
    GMTrace.i(18040607473664L, 134413);
    w.i("MicroMsg.WalletUserInfoManger", "setBankcards scene %d", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 == 8) {
      this.rjr = paramArrayList1;
    }
    this.rjx = paramList;
    this.rjs = paramae;
    this.qWC = paramArrayList1;
    this.qWD = paramArrayList2;
    this.qUy = paramBankcard1;
    this.rju = new ad(paramae.field_switchConfig);
    this.rjt = paramBankcard2;
    this.rjv = paramj;
    this.rjw = paramb;
    this.rjy = paramBankcard3;
    w.i("MicroMsg.WalletUserInfoManger", "setBankcards()! " + paramae.field_switchConfig);
    bzg();
    paramInt2 = paramInt1;
    if (paramInt1 < 0) {
      paramInt2 = 600;
    }
    this.rjz = (bg.Pu() + paramInt2);
    w.i("MicroMsg.WalletUserInfoManger", "hy: cache time: %d, dead time: %d", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(this.rjz) });
    n.byv().fTZ.eZ("WalletBankcard", "delete from WalletBankcard");
    if (paramArrayList1 != null) {
      n.byv().bN(paramArrayList1);
    }
    if (paramArrayList2 != null) {
      n.byv().bN(paramArrayList2);
    }
    if (paramBankcard1 != null) {
      n.byv().d(paramBankcard1);
    }
    if (paramBankcard2 != null) {
      n.byv().d(paramBankcard2);
    }
    if (paramBankcard3 != null) {
      n.byv().d(paramBankcard3);
    }
    n.byt().fTZ.eZ("WalletUserInfo", "delete from WalletUserInfo");
    n.byt().a(paramae);
    n.byz().fTZ.eZ("LoanEntryInfo", "delete from LoanEntryInfo");
    if (paramj != null) {
      n.byz().b(paramj);
    }
    GMTrace.o(18040607473664L, 134413);
  }
  
  public final String apc()
  {
    GMTrace.i(6893825163264L, 51363);
    if (this.rjs != null)
    {
      String str = this.rjs.field_true_name;
      GMTrace.o(6893825163264L, 51363);
      return str;
    }
    GMTrace.o(6893825163264L, 51363);
    return null;
  }
  
  public final void ayE()
  {
    GMTrace.i(6894496251904L, 51368);
    if (this.rjs != null)
    {
      this.rjs.field_is_reg = -1;
      this.rjs = null;
    }
    if (this.rju != null) {
      this.rju = null;
    }
    if (this.qUy != null) {
      this.qUy = null;
    }
    if (this.qWC != null)
    {
      this.qWC.clear();
      this.qWC = null;
    }
    if (this.qWD != null)
    {
      this.qWD.clear();
      this.qWD = null;
    }
    com.tencent.mm.wallet_core.ui.e.a(new e.c[] { new e.c("wallet_balance_version", Integer.valueOf(-1)), new e.c("wallet_balance_last_update_time", Integer.valueOf(-1)), new e.c("wallet_balance", Integer.valueOf(-1)) });
    this.rjz = bg.Pu();
    GMTrace.o(6894496251904L, 51368);
  }
  
  public final boolean byP()
  {
    GMTrace.i(6893019856896L, 51357);
    if ((this.rjs != null) && (this.rjs.byP()))
    {
      GMTrace.o(6893019856896L, 51357);
      return true;
    }
    GMTrace.o(6893019856896L, 51357);
    return false;
  }
  
  public final boolean byR()
  {
    GMTrace.i(6892751421440L, 51355);
    if ((this.rjs == null) || ((this.rjs != null) && (this.rjs.byQ())))
    {
      GMTrace.o(6892751421440L, 51355);
      return true;
    }
    GMTrace.o(6892751421440L, 51355);
    return false;
  }
  
  public final boolean byS()
  {
    GMTrace.i(6892885639168L, 51356);
    if (this.rjs != null)
    {
      if (this.rjs.field_is_reg == 1) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(6892885639168L, 51356);
        return true;
      }
    }
    GMTrace.o(6892885639168L, 51356);
    return false;
  }
  
  public final boolean byT()
  {
    GMTrace.i(6893154074624L, 51358);
    if (this.rjs != null)
    {
      if (this.rjs.field_is_reg == 2) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(6893154074624L, 51358);
        return true;
      }
    }
    GMTrace.o(6893154074624L, 51358);
    return false;
  }
  
  public final boolean byU()
  {
    GMTrace.i(6893288292352L, 51359);
    if (this.rjs != null)
    {
      if (this.rjs.field_is_open_touch == 1) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(6893288292352L, 51359);
        return true;
      }
    }
    GMTrace.o(6893288292352L, 51359);
    return false;
  }
  
  public final String byV()
  {
    GMTrace.i(6893422510080L, 51360);
    if (this.rjs != null)
    {
      String str = this.rjs.field_ftf_pay_url;
      GMTrace.o(6893422510080L, 51360);
      return str;
    }
    GMTrace.o(6893422510080L, 51360);
    return null;
  }
  
  public final ad byW()
  {
    GMTrace.i(6893556727808L, 51361);
    if (this.rju == null)
    {
      localad = new ad();
      GMTrace.o(6893556727808L, 51361);
      return localad;
    }
    ad localad = this.rju;
    GMTrace.o(6893556727808L, 51361);
    return localad;
  }
  
  public final boolean byX()
  {
    GMTrace.i(6893690945536L, 51362);
    if ((this.rjs != null) && (this.rjs.field_isDomesticUser))
    {
      GMTrace.o(6893690945536L, 51362);
      return true;
    }
    GMTrace.o(6893690945536L, 51362);
    return false;
  }
  
  public final int byY()
  {
    GMTrace.i(6893959380992L, 51364);
    if (this.rjs != null)
    {
      int i = this.rjs.field_cre_type;
      GMTrace.o(6893959380992L, 51364);
      return i;
    }
    GMTrace.o(6893959380992L, 51364);
    return 1;
  }
  
  public final String byZ()
  {
    GMTrace.i(6894093598720L, 51365);
    h.xz();
    String str = (String)h.xy().xh().get(w.a.vzj, null);
    if (!bg.nm(str))
    {
      GMTrace.o(6894093598720L, 51365);
      return str;
    }
    if (this.rjs != null)
    {
      str = this.rjs.field_lct_wording;
      GMTrace.o(6894093598720L, 51365);
      return str;
    }
    GMTrace.o(6894093598720L, 51365);
    return null;
  }
  
  public final String bza()
  {
    GMTrace.i(6894227816448L, 51366);
    if (this.rjs != null)
    {
      String str = this.rjs.field_lct_url;
      GMTrace.o(6894227816448L, 51366);
      return str;
    }
    GMTrace.o(6894227816448L, 51366);
    return null;
  }
  
  public final void bzb()
  {
    Object localObject3 = null;
    Object localObject2 = null;
    GMTrace.i(6894362034176L, 51367);
    if (!h.xw().wL())
    {
      w.w("MicroMsg.WalletUserInfoManger", "Account Not Ready!");
      GMTrace.o(6894362034176L, 51367);
      return;
    }
    this.rjs = n.byt().bzr();
    if (this.rjs != null) {}
    Object localObject1;
    Object localObject4;
    for (this.rju = new ad(this.rjs.field_switchConfig);; this.rju = new ad())
    {
      localObject1 = n.byv();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.reB + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.d.c)localObject1).fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null) {
        break;
      }
      localObject1 = null;
      this.qUy = ((Bankcard)localObject1);
      localObject1 = n.byv();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.reE + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.d.c)localObject1).fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null) {
        break label383;
      }
      localObject1 = null;
      this.rjy = ((Bankcard)localObject1);
      com.tencent.mm.wallet_core.ui.e.a("wallet_balance", new e.b()
      {
        public final void bu(Object paramAnonymousObject)
        {
          GMTrace.i(6889798631424L, 51333);
          if ((paramAnonymousObject != null) && ((paramAnonymousObject instanceof Double)))
          {
            if (((Double)paramAnonymousObject).doubleValue() < 0.0D) {
              w.v("MicroMsg.WalletUserInfoManger", "val is zero %s", new Object[] { bg.bQW().toString() });
            }
            if (af.this.qUy != null)
            {
              af.this.qUy.reK = ((Double)paramAnonymousObject).doubleValue();
              GMTrace.o(6889798631424L, 51333);
            }
          }
          else
          {
            w.i("MicroMsg.WalletUserInfoManger", "hy: no balance info. set to negative");
            if (af.this.qUy != null) {
              af.this.qUy.reK = -1.0D;
            }
          }
          GMTrace.o(6889798631424L, 51333);
        }
      });
      this.qWC = n.byv().bzc();
      this.qWD = n.byv().bzp();
      localObject1 = n.byv();
      localObject4 = "select * from WalletBankcard where cardType & " + Bankcard.reC + " != 0 ";
      localObject4 = ((com.tencent.mm.plugin.wallet_core.d.c)localObject1).fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null) {
        break label417;
      }
      localObject1 = null;
      this.rjt = ((Bankcard)localObject1);
      localObject4 = n.byz().fTZ.a("select * from LoanEntryInfo", null, 2);
      if (localObject4 != null) {
        break label451;
      }
      localObject1 = localObject2;
      label308:
      this.rjv = ((j)localObject1);
      w.i("MicroMsg.WalletUserInfoManger", "loadDbData!");
      bzg();
      GMTrace.o(6894362034176L, 51367);
      return;
    }
    if (((Cursor)localObject4).moveToFirst())
    {
      localObject1 = new Bankcard();
      ((Bankcard)localObject1).b((Cursor)localObject4);
    }
    for (;;)
    {
      ((Cursor)localObject4).close();
      break;
      label383:
      if (((Cursor)localObject4).moveToFirst())
      {
        localObject1 = new Bankcard();
        ((Bankcard)localObject1).b((Cursor)localObject4);
      }
      for (;;)
      {
        ((Cursor)localObject4).close();
        break;
        label417:
        if (((Cursor)localObject4).moveToNext())
        {
          localObject1 = new Bankcard();
          ((Bankcard)localObject1).b((Cursor)localObject4);
        }
        for (;;)
        {
          ((Cursor)localObject4).close();
          break;
          label451:
          localObject1 = localObject3;
          if (((Cursor)localObject4).moveToFirst())
          {
            localObject1 = new j();
            ((j)localObject1).b((Cursor)localObject4);
          }
          ((Cursor)localObject4).close();
          break label308;
          localObject1 = null;
        }
        localObject1 = null;
      }
      localObject1 = null;
    }
  }
  
  public final ArrayList<Bankcard> bzc()
  {
    GMTrace.i(6894630469632L, 51369);
    if ((this.qWC == null) || (this.qWC.size() <= 0)) {
      this.qWC = n.byv().bzc();
    }
    if ((this.qWC == null) || (this.qWC.size() <= 0))
    {
      GMTrace.o(6894630469632L, 51369);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.qWC.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((Bankcard)localIterator.next());
    }
    GMTrace.o(6894630469632L, 51369);
    return localArrayList;
  }
  
  public final List<c> bzd()
  {
    GMTrace.i(18040473255936L, 134412);
    if (this.rjx != null) {
      this.rjx.size();
    }
    if ((this.rjx == null) || (this.rjx.size() <= 0))
    {
      GMTrace.o(18040473255936L, 134412);
      return null;
    }
    List localList = this.rjx;
    GMTrace.o(18040473255936L, 134412);
    return localList;
  }
  
  public final ArrayList<Bankcard> bze()
  {
    GMTrace.i(6894764687360L, 51370);
    if ((this.qWC == null) || (this.qWC.size() <= 0))
    {
      GMTrace.o(6894764687360L, 51370);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.qWC.iterator();
    while (localIterator.hasNext())
    {
      Bankcard localBankcard = (Bankcard)localIterator.next();
      if (!localBankcard.byf()) {
        localArrayList.add(localBankcard);
      }
    }
    GMTrace.o(6894764687360L, 51370);
    return localArrayList;
  }
  
  public final String bzf()
  {
    GMTrace.i(6896106864640L, 51380);
    if ((this.qWC == null) || (this.qWC.size() <= 0))
    {
      w.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
      GMTrace.o(6896106864640L, 51380);
      return null;
    }
    Object localObject = this.qWC.iterator();
    if (((Iterator)localObject).hasNext())
    {
      localObject = ((Bankcard)((Iterator)localObject).next()).field_bindSerial;
      GMTrace.o(6896106864640L, 51380);
      return (String)localObject;
    }
    GMTrace.o(6896106864640L, 51380);
    return null;
  }
  
  public final void d(ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2)
  {
    GMTrace.i(6895167340544L, 51373);
    if ((this.qWC == null) || (paramArrayList1 == null) || (paramArrayList2 == null))
    {
      w.e("MicroMsg.WalletUserInfoManger", "error list, bankcards == null || bankcardsClone == null || virtualBankcardsClone == null");
      GMTrace.o(6895167340544L, 51373);
      return;
    }
    paramArrayList1.clear();
    paramArrayList2.clear();
    Iterator localIterator;
    if (this.qWC != null)
    {
      localIterator = this.qWC.iterator();
      while (localIterator.hasNext()) {
        paramArrayList1.add((Bankcard)localIterator.next());
      }
    }
    if (this.qWD != null)
    {
      localIterator = this.qWD.iterator();
      while (localIterator.hasNext())
      {
        Bankcard localBankcard = (Bankcard)localIterator.next();
        if (localBankcard.field_wxcreditState == 0) {
          paramArrayList2.add(localBankcard);
        } else {
          paramArrayList1.add(localBankcard);
        }
      }
    }
    GMTrace.o(6895167340544L, 51373);
  }
  
  public final ArrayList<Bankcard> iL(boolean paramBoolean)
  {
    GMTrace.i(6894898905088L, 51371);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      if ((this.qUy != null) && (!byP())) {
        localArrayList.add(this.qUy);
      }
      if ((this.rjy != null) && (!byP()) && (this.rjs != null) && (this.rjs.field_lqt_state == 1)) {
        localArrayList.add(this.rjy);
      }
    }
    if ((this.qWC != null) && (this.qWC.size() > 0))
    {
      Iterator localIterator = this.qWC.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add((Bankcard)localIterator.next());
      }
    }
    GMTrace.o(6894898905088L, 51371);
    return localArrayList;
  }
  
  public final ArrayList<Bankcard> iT(boolean paramBoolean)
  {
    GMTrace.i(6895033122816L, 51372);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      if ((this.qUy != null) && (!byP())) {
        localArrayList.add(this.qUy);
      }
      if ((this.rjy != null) && (!byP()) && (this.rjs != null) && (this.rjs.field_lqt_state == 1)) {
        localArrayList.add(this.rjy);
      }
    }
    Iterator localIterator;
    if ((this.rjr != null) && (this.qWC != null) && (this.rjr.size() == this.qWC.size()) && (this.rjr.size() > 0)) {
      localIterator = this.rjr.iterator();
    }
    while (localIterator.hasNext())
    {
      localArrayList.add((Bankcard)localIterator.next());
      continue;
      if ((this.qWC != null) && (this.qWC.size() > 0))
      {
        localIterator = this.qWC.iterator();
        while (localIterator.hasNext()) {
          localArrayList.add((Bankcard)localIterator.next());
        }
      }
    }
    GMTrace.o(6895033122816L, 51372);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */