package com.tencent.mm.l;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public class a
  extends af
{
  public static c.a fTp;
  private static a fTr;
  public long fTq;
  public int versionCode;
  
  static
  {
    GMTrace.i(13263127445504L, 98818);
    c.a locala = new c.a();
    locala.gZM = new Field[19];
    locala.columns = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.vmt.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "username";
    locala.columns[1] = "alias";
    locala.vmt.put("alias", "TEXT default '' ");
    localStringBuilder.append(" alias TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "conRemark";
    locala.vmt.put("conRemark", "TEXT default '' ");
    localStringBuilder.append(" conRemark TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "domainList";
    locala.vmt.put("domainList", "TEXT default '' ");
    localStringBuilder.append(" domainList TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[4] = "nickname";
    locala.vmt.put("nickname", "TEXT default '' ");
    localStringBuilder.append(" nickname TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "pyInitial";
    locala.vmt.put("pyInitial", "TEXT default '' ");
    localStringBuilder.append(" pyInitial TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "quanPin";
    locala.vmt.put("quanPin", "TEXT default '' ");
    localStringBuilder.append(" quanPin TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "showHead";
    locala.vmt.put("showHead", "INTEGER default '0' ");
    localStringBuilder.append(" showHead INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "type";
    locala.vmt.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "weiboFlag";
    locala.vmt.put("weiboFlag", "INTEGER default '0' ");
    localStringBuilder.append(" weiboFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "weiboNickname";
    locala.vmt.put("weiboNickname", "TEXT default '' ");
    localStringBuilder.append(" weiboNickname TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "conRemarkPYFull";
    locala.vmt.put("conRemarkPYFull", "TEXT default '' ");
    localStringBuilder.append(" conRemarkPYFull TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "conRemarkPYShort";
    locala.vmt.put("conRemarkPYShort", "TEXT default '' ");
    localStringBuilder.append(" conRemarkPYShort TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "lvbuff";
    locala.vmt.put("lvbuff", "BLOB");
    localStringBuilder.append(" lvbuff BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "verifyFlag";
    locala.vmt.put("verifyFlag", "INTEGER default '0' ");
    localStringBuilder.append(" verifyFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[15] = "encryptUsername";
    locala.vmt.put("encryptUsername", "TEXT default '' ");
    localStringBuilder.append(" encryptUsername TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[16] = "chatroomFlag";
    locala.vmt.put("chatroomFlag", "INTEGER");
    localStringBuilder.append(" chatroomFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "deleteFlag";
    locala.vmt.put("deleteFlag", "INTEGER default '0' ");
    localStringBuilder.append(" deleteFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "contactLabelIds";
    locala.vmt.put("contactLabelIds", "TEXT default '' ");
    localStringBuilder.append(" contactLabelIds TEXT default '' ");
    locala.columns[19] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    fTr = null;
    GMTrace.o(13263127445504L, 98818);
  }
  
  public a()
  {
    GMTrace.i(13249437237248L, 98716);
    this.versionCode = 0;
    super.setUsername("");
    super.cl("");
    super.cm("");
    super.cn("");
    super.ci("");
    super.cj("");
    super.cq("");
    super.cp("");
    super.ck("");
    super.dj(0);
    super.co("");
    super.di(0);
    super.setType(0);
    super.dk(0);
    super.dl(0);
    super.cs("");
    super.jdMethod_do(0);
    super.cB("");
    super.du(0);
    super.dp(0);
    super.cu("");
    super.cv("");
    super.dq(0);
    super.dr(0);
    super.cw("");
    super.cx("");
    super.ds(1);
    super.dn(0);
    super.dt(0);
    super.cy("");
    super.cz("");
    super.cA("");
    super.setSource(0);
    super.cD("");
    super.cC("");
    super.w(0L);
    super.ct("");
    super.cE("");
    super.dv(0);
    super.cH("");
    super.cI("");
    super.cJ("");
    super.cM("");
    this.versionCode = 0;
    GMTrace.o(13249437237248L, 98716);
  }
  
  public a(String paramString)
  {
    this();
    GMTrace.i(13249303019520L, 98715);
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    setUsername(str);
    GMTrace.o(13249303019520L, 98715);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13249571454976L, 98717);
    fTr = parama;
    GMTrace.o(13249571454976L, 98717);
  }
  
  public static boolean eE(int paramInt)
  {
    GMTrace.i(13252926898176L, 98742);
    if ((paramInt & 0x1) != 0)
    {
      GMTrace.o(13252926898176L, 98742);
      return true;
    }
    GMTrace.o(13252926898176L, 98742);
    return false;
  }
  
  public static String eg(String paramString)
  {
    GMTrace.i(13249705672704L, 98718);
    if (fTr != null)
    {
      paramString = fTr.bN(paramString);
      GMTrace.o(13249705672704L, 98718);
      return paramString;
    }
    GMTrace.o(13249705672704L, 98718);
    return null;
  }
  
  public static String eh(String paramString)
  {
    GMTrace.i(13255745470464L, 98763);
    if (paramString == null)
    {
      GMTrace.o(13255745470464L, 98763);
      return null;
    }
    if (paramString.toLowerCase().endsWith("@t.qq.com"))
    {
      paramString = "@" + paramString.replace("@t.qq.com", "");
      GMTrace.o(13255745470464L, 98763);
      return paramString;
    }
    if (paramString.toLowerCase().endsWith("@qqim"))
    {
      paramString = paramString.replace("@qqim", "");
      long l = Long.valueOf(paramString).longValue();
      if (l < 0L)
      {
        paramString = new o(l).toString();
        GMTrace.o(13255745470464L, 98763);
        return paramString;
      }
      GMTrace.o(13255745470464L, 98763);
      return paramString;
    }
    GMTrace.o(13255745470464L, 98763);
    return paramString;
  }
  
  private static boolean isLetter(char paramChar)
  {
    GMTrace.i(13254403293184L, 98753);
    if (((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z')))
    {
      GMTrace.o(13254403293184L, 98753);
      return true;
    }
    GMTrace.o(13254403293184L, 98753);
    return false;
  }
  
  public static int uR()
  {
    GMTrace.i(13252255809536L, 98737);
    GMTrace.o(13252255809536L, 98737);
    return 1;
  }
  
  public static int uS()
  {
    GMTrace.i(13252390027264L, 98738);
    GMTrace.o(13252390027264L, 98738);
    return 8;
  }
  
  public static int uT()
  {
    GMTrace.i(16765539057664L, 124913);
    GMTrace.o(16765539057664L, 124913);
    return 524288;
  }
  
  public static int uU()
  {
    GMTrace.i(13252524244992L, 98739);
    GMTrace.o(13252524244992L, 98739);
    return 16;
  }
  
  public static int uV()
  {
    GMTrace.i(13252658462720L, 98740);
    GMTrace.o(13252658462720L, 98740);
    return 32;
  }
  
  private int vn()
  {
    GMTrace.i(13256148123648L, 98766);
    int i = this.versionCode + 1;
    this.versionCode = i;
    GMTrace.o(13256148123648L, 98766);
    return i;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(13256013905920L, 98765);
    super.b(paramCursor);
    this.fTq = this.vmr;
    super.u(null);
    GMTrace.o(13256013905920L, 98765);
  }
  
  public void cA(String paramString)
  {
    GMTrace.i(13260845744128L, 98801);
    if (!bg.eW(getCity(), paramString))
    {
      super.cA(paramString);
      vn();
    }
    GMTrace.o(13260845744128L, 98801);
  }
  
  public final void cB(String paramString)
  {
    GMTrace.i(13260979961856L, 98802);
    if (!bg.eW(this.fjm, paramString))
    {
      super.cB(paramString);
      vn();
    }
    GMTrace.o(13260979961856L, 98802);
  }
  
  public final void cC(String paramString)
  {
    GMTrace.i(13261382615040L, 98805);
    if (!bg.eW(this.fjo, paramString))
    {
      super.cC(paramString);
      vn();
    }
    GMTrace.o(13261382615040L, 98805);
  }
  
  public final void cD(String paramString)
  {
    GMTrace.i(13261516832768L, 98806);
    if (!bg.eW(this.fjp, paramString))
    {
      super.cD(paramString);
      vn();
    }
    GMTrace.o(13261516832768L, 98806);
  }
  
  public void cE(String paramString)
  {
    GMTrace.i(13261651050496L, 98807);
    if (!bg.eW(this.fjq, paramString))
    {
      super.cE(paramString);
      vn();
    }
    GMTrace.o(13261651050496L, 98807);
  }
  
  public final void cF(String paramString)
  {
    GMTrace.i(13262053703680L, 98810);
    if (!bg.eW(this.fjt, paramString))
    {
      super.cF(paramString);
      vn();
    }
    GMTrace.o(13262053703680L, 98810);
  }
  
  public final void cG(String paramString)
  {
    GMTrace.i(13262187921408L, 98811);
    if (!bg.eW(this.fju, paramString))
    {
      super.cG(paramString);
      vn();
    }
    GMTrace.o(13262187921408L, 98811);
  }
  
  public final void cH(String paramString)
  {
    GMTrace.i(13262322139136L, 98812);
    if (!bg.eW(this.fjv, paramString))
    {
      super.cH(paramString);
      vn();
    }
    GMTrace.o(13262322139136L, 98812);
  }
  
  public final void cI(String paramString)
  {
    GMTrace.i(13262456356864L, 98813);
    if (!bg.eW(this.fjw, paramString))
    {
      super.cI(paramString);
      vn();
    }
    GMTrace.o(13262456356864L, 98813);
  }
  
  public final void cJ(String paramString)
  {
    GMTrace.i(13262590574592L, 98814);
    if (!bg.eW(this.fjx, paramString))
    {
      super.cJ(paramString);
      vn();
    }
    GMTrace.o(13262590574592L, 98814);
  }
  
  public final void cK(String paramString)
  {
    GMTrace.i(13262724792320L, 98815);
    if (!bg.eW(this.fjy, paramString))
    {
      super.cK(paramString);
      vn();
    }
    GMTrace.o(13262724792320L, 98815);
  }
  
  public final void cL(String paramString)
  {
    GMTrace.i(13262859010048L, 98816);
    if (!bg.eW(this.fjz, paramString))
    {
      super.cL(paramString);
      vn();
    }
    GMTrace.o(13262859010048L, 98816);
  }
  
  public final void cM(String paramString)
  {
    GMTrace.i(13262993227776L, 98817);
    if (!bg.eW(this.fjA, paramString))
    {
      super.cM(paramString);
      vn();
    }
    GMTrace.o(13262993227776L, 98817);
  }
  
  public final void ci(String paramString)
  {
    GMTrace.i(13256416559104L, 98768);
    if (!bg.eW(qQ(), paramString))
    {
      super.ci(paramString);
      vn();
    }
    GMTrace.o(13256416559104L, 98768);
  }
  
  public final void cj(String paramString)
  {
    GMTrace.i(13256550776832L, 98769);
    if (!bg.eW(this.field_conRemark, paramString))
    {
      super.cj(paramString);
      vn();
    }
    GMTrace.o(13256550776832L, 98769);
  }
  
  public final void ck(String paramString)
  {
    GMTrace.i(13256684994560L, 98770);
    if (!bg.eW(this.field_domainList, paramString))
    {
      super.ck(paramString);
      vn();
    }
    GMTrace.o(13256684994560L, 98770);
  }
  
  public final void cl(String paramString)
  {
    GMTrace.i(13256819212288L, 98771);
    if (!bg.eW(this.field_nickname, paramString))
    {
      super.cl(paramString);
      vn();
    }
    GMTrace.o(13256819212288L, 98771);
  }
  
  public final void cm(String paramString)
  {
    GMTrace.i(13256953430016L, 98772);
    if (!bg.eW(qR(), paramString))
    {
      super.cm(paramString);
      vn();
    }
    GMTrace.o(13256953430016L, 98772);
  }
  
  public final void cn(String paramString)
  {
    GMTrace.i(13257087647744L, 98773);
    if (!bg.eW(qS(), paramString))
    {
      super.cn(paramString);
      vn();
    }
    GMTrace.o(13257087647744L, 98773);
  }
  
  public final void co(String paramString)
  {
    GMTrace.i(13257624518656L, 98777);
    if (!bg.eW(this.field_weiboNickname, paramString))
    {
      super.co(paramString);
      vn();
    }
    GMTrace.o(13257624518656L, 98777);
  }
  
  public final void cp(String paramString)
  {
    GMTrace.i(13257758736384L, 98778);
    if (!bg.eW(this.field_conRemarkPYFull, paramString))
    {
      super.cp(paramString);
      vn();
    }
    GMTrace.o(13257758736384L, 98778);
  }
  
  public final void cq(String paramString)
  {
    GMTrace.i(13257892954112L, 98779);
    if (!bg.eW(this.field_conRemarkPYShort, paramString))
    {
      super.cq(paramString);
      vn();
    }
    GMTrace.o(13257892954112L, 98779);
  }
  
  public final void cr(String paramString)
  {
    GMTrace.i(13258295607296L, 98782);
    if (!bg.eW(this.field_encryptUsername, paramString))
    {
      super.cr(paramString);
      vn();
    }
    GMTrace.o(13258295607296L, 98782);
  }
  
  public final void cs(String paramString)
  {
    GMTrace.i(13258698260480L, 98785);
    if (!bg.eW(this.field_contactLabelIds, paramString))
    {
      super.cs(paramString);
      vn();
    }
    GMTrace.o(13258698260480L, 98785);
  }
  
  public final void ct(String paramString)
  {
    GMTrace.i(13259100913664L, 98788);
    if (!bg.eW(this.fjb, paramString))
    {
      super.ct(paramString);
      vn();
    }
    GMTrace.o(13259100913664L, 98788);
  }
  
  public final void cu(String paramString)
  {
    GMTrace.i(13259503566848L, 98791);
    if (!bg.eW(this.fjd, paramString))
    {
      super.cu(paramString);
      vn();
    }
    GMTrace.o(13259503566848L, 98791);
  }
  
  public final void cv(String paramString)
  {
    GMTrace.i(13259637784576L, 98792);
    if (!bg.eW(this.eMW, paramString))
    {
      super.cv(paramString);
      vn();
    }
    GMTrace.o(13259637784576L, 98792);
  }
  
  public final void cw(String paramString)
  {
    GMTrace.i(13260040437760L, 98795);
    if (!bg.eW(this.fjg, paramString))
    {
      super.cw(paramString);
      vn();
    }
    GMTrace.o(13260040437760L, 98795);
  }
  
  public final void cx(String paramString)
  {
    GMTrace.i(13260174655488L, 98796);
    if (!bg.eW(this.fjh, paramString))
    {
      super.cx(paramString);
      vn();
    }
    GMTrace.o(13260174655488L, 98796);
  }
  
  public final void cy(String paramString)
  {
    GMTrace.i(13260577308672L, 98799);
    if (!bg.eW(this.signature, paramString))
    {
      super.cy(paramString);
      vn();
    }
    GMTrace.o(13260577308672L, 98799);
  }
  
  public void cz(String paramString)
  {
    GMTrace.i(13260711526400L, 98800);
    if (!bg.eW(getProvince(), paramString))
    {
      super.cz(paramString);
      vn();
    }
    GMTrace.o(13260711526400L, 98800);
  }
  
  public final void di(int paramInt)
  {
    GMTrace.i(13257221865472L, 98774);
    if (!bg.ec(this.field_showHead, paramInt))
    {
      super.di(paramInt);
      vn();
    }
    GMTrace.o(13257221865472L, 98774);
  }
  
  public final void dj(int paramInt)
  {
    GMTrace.i(13257490300928L, 98776);
    if (!bg.ec(this.field_weiboFlag, paramInt))
    {
      super.dj(paramInt);
      vn();
    }
    GMTrace.o(13257490300928L, 98776);
  }
  
  public final void dk(int paramInt)
  {
    GMTrace.i(13258161389568L, 98781);
    if (!bg.ec(this.field_verifyFlag, paramInt))
    {
      super.dk(paramInt);
      vn();
    }
    GMTrace.o(13258161389568L, 98781);
  }
  
  public final void dl(int paramInt)
  {
    GMTrace.i(13258429825024L, 98783);
    if (!bg.ec(this.field_chatroomFlag, paramInt))
    {
      super.dl(paramInt);
      vn();
    }
    GMTrace.o(13258429825024L, 98783);
  }
  
  public final void dm(int paramInt)
  {
    GMTrace.i(13258564042752L, 98784);
    if (!bg.ec(this.field_deleteFlag, paramInt))
    {
      super.dm(paramInt);
      vn();
    }
    GMTrace.o(13258564042752L, 98784);
  }
  
  public final void dn(int paramInt)
  {
    GMTrace.i(13258832478208L, 98786);
    if (!bg.ec(this.fiZ, paramInt))
    {
      super.dn(paramInt);
      vn();
    }
    GMTrace.o(13258832478208L, 98786);
  }
  
  public final void jdMethod_do(int paramInt)
  {
    GMTrace.i(13258966695936L, 98787);
    if (!bg.ec(this.fja, paramInt))
    {
      super.jdMethod_do(paramInt);
      vn();
    }
    GMTrace.o(13258966695936L, 98787);
  }
  
  public final void dp(int paramInt)
  {
    GMTrace.i(13259369349120L, 98790);
    if (!bg.ec(this.uin, paramInt))
    {
      super.dp(paramInt);
      vn();
    }
    GMTrace.o(13259369349120L, 98790);
  }
  
  public final void dq(int paramInt)
  {
    GMTrace.i(13259772002304L, 98793);
    if (!bg.ec(this.fje, paramInt))
    {
      super.dq(paramInt);
      vn();
    }
    GMTrace.o(13259772002304L, 98793);
  }
  
  public final void dr(int paramInt)
  {
    GMTrace.i(13259906220032L, 98794);
    if (!bg.ec(this.fjf, paramInt))
    {
      super.dr(paramInt);
      vn();
    }
    GMTrace.o(13259906220032L, 98794);
  }
  
  public final void ds(int paramInt)
  {
    GMTrace.i(13260308873216L, 98797);
    if (!bg.ec(this.fji, paramInt))
    {
      super.ds(paramInt);
      vn();
    }
    GMTrace.o(13260308873216L, 98797);
  }
  
  public final void dt(int paramInt)
  {
    GMTrace.i(13260443090944L, 98798);
    if (!bg.ec(this.fjj, paramInt))
    {
      super.dt(paramInt);
      vn();
    }
    GMTrace.o(13260443090944L, 98798);
  }
  
  public final void du(int paramInt)
  {
    GMTrace.i(13261114179584L, 98803);
    if (!bg.ec(this.fjn, paramInt))
    {
      super.du(paramInt);
      vn();
    }
    GMTrace.o(13261114179584L, 98803);
  }
  
  public final void dv(int paramInt)
  {
    GMTrace.i(13261785268224L, 98808);
    if (!bg.ec(this.fjr, paramInt))
    {
      super.dv(paramInt);
      vn();
    }
    GMTrace.o(13261785268224L, 98808);
  }
  
  public final void dw(int paramInt)
  {
    GMTrace.i(13261919485952L, 98809);
    if (!bg.ec(this.fjs, paramInt))
    {
      super.dw(paramInt);
      vn();
    }
    GMTrace.o(13261919485952L, 98809);
  }
  
  public final void eF(int paramInt)
  {
    GMTrace.i(13255879688192L, 98764);
    dl(this.field_chatroomFlag & 0xFFFFFFFE | paramInt & 0x1);
    GMTrace.o(13255879688192L, 98764);
  }
  
  public final int getSource()
  {
    GMTrace.i(13255477035008L, 98761);
    int i = super.getSource();
    GMTrace.o(13255477035008L, 98761);
    return i % 1000000;
  }
  
  public final boolean isHidden()
  {
    GMTrace.i(13253061115904L, 98743);
    if ((this.field_type & 0x20) != 0)
    {
      GMTrace.o(13253061115904L, 98743);
      return true;
    }
    GMTrace.o(13253061115904L, 98743);
    return false;
  }
  
  public final String qQ()
  {
    GMTrace.i(13254940164096L, 98757);
    if (fTr != null) {}
    for (String str = fTr.bO(this.field_username); str == null; str = null)
    {
      str = super.qQ();
      GMTrace.o(13254940164096L, 98757);
      return str;
    }
    GMTrace.o(13254940164096L, 98757);
    return str;
  }
  
  public final String qR()
  {
    GMTrace.i(13254671728640L, 98755);
    if ((super.qR() == null) || (super.qR().length() < 0))
    {
      str = qS();
      GMTrace.o(13254671728640L, 98755);
      return str;
    }
    String str = super.qR();
    GMTrace.o(13254671728640L, 98755);
    return str;
  }
  
  public final String qS()
  {
    GMTrace.i(13254805946368L, 98756);
    if ((super.qS() == null) || (super.qS().length() < 0))
    {
      str = this.field_nickname;
      GMTrace.o(13254805946368L, 98756);
      return str;
    }
    String str = super.qS();
    GMTrace.o(13254805946368L, 98756);
    return str;
  }
  
  public final void setSource(int paramInt)
  {
    GMTrace.i(13261248397312L, 98804);
    if (!bg.ec(super.getSource(), paramInt))
    {
      super.setSource(paramInt);
      vn();
    }
    GMTrace.o(13261248397312L, 98804);
  }
  
  public final void setType(int paramInt)
  {
    GMTrace.i(13257356083200L, 98775);
    if (!bg.ec(this.field_type, paramInt))
    {
      super.setType(paramInt);
      vn();
    }
    GMTrace.o(13257356083200L, 98775);
  }
  
  public final void setUsername(String paramString)
  {
    GMTrace.i(13256282341376L, 98767);
    if (!bg.eW(this.field_username, paramString))
    {
      super.setUsername(paramString);
      vn();
    }
    GMTrace.o(13256282341376L, 98767);
  }
  
  public final void u(byte[] paramArrayOfByte)
  {
    GMTrace.i(13258027171840L, 98780);
    if (!bg.isEqual(this.field_lvbuff, paramArrayOfByte))
    {
      super.u(paramArrayOfByte);
      vn();
    }
    GMTrace.o(13258027171840L, 98780);
  }
  
  public final void uA()
  {
    GMTrace.i(13250242543616L, 98722);
    setType(this.field_type | 0x1);
    GMTrace.o(13250242543616L, 98722);
  }
  
  public final void uB()
  {
    GMTrace.i(13250376761344L, 98723);
    w.w("MicroMsg.RContact", "unSetContact!! user:%s oldType:%d [%s]", new Object[] { this.field_username, Integer.valueOf(this.field_type), bg.bQW() });
    setType(this.field_type & 0xFFFFFFFE);
    GMTrace.o(13250376761344L, 98723);
  }
  
  public final void uC()
  {
    GMTrace.i(13250510979072L, 98724);
    setType(this.field_type | 0x8);
    GMTrace.o(13250510979072L, 98724);
  }
  
  public final void uD()
  {
    GMTrace.i(13250645196800L, 98725);
    setType(this.field_type & 0xFFFFFFF7);
    GMTrace.o(13250645196800L, 98725);
  }
  
  public final void uE()
  {
    GMTrace.i(16765270622208L, 124911);
    setType(this.field_type | 0x80000);
    GMTrace.o(16765270622208L, 124911);
  }
  
  public final void uF()
  {
    GMTrace.i(16765404839936L, 124912);
    setType(this.field_type & 0xFFF7FFFF);
    GMTrace.o(16765404839936L, 124912);
  }
  
  public final void uG()
  {
    GMTrace.i(13250779414528L, 98726);
    setType(this.field_type | 0x2);
    GMTrace.o(13250779414528L, 98726);
  }
  
  public final void uH()
  {
    GMTrace.i(13250913632256L, 98727);
    setType(this.field_type & 0xFFFFFFFD);
    GMTrace.o(13250913632256L, 98727);
  }
  
  public final void uI()
  {
    GMTrace.i(13251047849984L, 98728);
    setType(this.field_type & 0xF7FF);
    GMTrace.o(13251047849984L, 98728);
  }
  
  public final void uJ()
  {
    GMTrace.i(13251182067712L, 98729);
    setType(this.field_type | 0x20);
    GMTrace.o(13251182067712L, 98729);
  }
  
  public final void uK()
  {
    GMTrace.i(13251316285440L, 98730);
    setType(this.field_type & 0xFFFFFFDF);
    GMTrace.o(13251316285440L, 98730);
  }
  
  public final void uL()
  {
    GMTrace.i(13251450503168L, 98731);
    setType(this.field_type | 0x40);
    GMTrace.o(13251450503168L, 98731);
  }
  
  public final void uM()
  {
    GMTrace.i(13251584720896L, 98732);
    setType(this.field_type & 0xFFFFFFBF);
    GMTrace.o(13251584720896L, 98732);
  }
  
  public final void uN()
  {
    GMTrace.i(13251718938624L, 98733);
    setType(this.field_type | 0x200);
    GMTrace.o(13251718938624L, 98733);
  }
  
  public final void uO()
  {
    GMTrace.i(13251853156352L, 98734);
    setType(this.field_type & 0xFDFF);
    GMTrace.o(13251853156352L, 98734);
  }
  
  public final void uP()
  {
    GMTrace.i(13251987374080L, 98735);
    setType(this.field_type | 0x100);
    GMTrace.o(13251987374080L, 98735);
  }
  
  public final void uQ()
  {
    GMTrace.i(13252121591808L, 98736);
    setType(this.field_type & 0xFEFF);
    GMTrace.o(13252121591808L, 98736);
  }
  
  public final boolean uW()
  {
    GMTrace.i(13252792680448L, 98741);
    boolean bool = eE(this.field_type);
    GMTrace.o(13252792680448L, 98741);
    return bool;
  }
  
  public final boolean uX()
  {
    GMTrace.i(20305934286848L, 151291);
    if ((this.field_type & 0x2) != 0)
    {
      GMTrace.o(20305934286848L, 151291);
      return true;
    }
    GMTrace.o(20305934286848L, 151291);
    return false;
  }
  
  public final boolean uY()
  {
    GMTrace.i(13253195333632L, 98744);
    if ((this.field_type & 0x4) != 0)
    {
      GMTrace.o(13253195333632L, 98744);
      return true;
    }
    GMTrace.o(13253195333632L, 98744);
    return false;
  }
  
  public final boolean uZ()
  {
    GMTrace.i(13253329551360L, 98745);
    if ((this.field_type & 0x8) != 0)
    {
      GMTrace.o(13253329551360L, 98745);
      return true;
    }
    GMTrace.o(13253329551360L, 98745);
    return false;
  }
  
  public final c.a uw()
  {
    GMTrace.i(13249168801792L, 98714);
    c.a locala = fTp;
    GMTrace.o(13249168801792L, 98714);
    return locala;
  }
  
  public final int ux()
  {
    GMTrace.i(13249839890432L, 98719);
    int j = 32;
    int i;
    if ((this.field_conRemarkPYShort != null) && (!this.field_conRemarkPYShort.equals("")))
    {
      i = this.field_conRemarkPYShort.charAt(0);
      if ((i < 97) || (i > 122)) {
        break label258;
      }
      j = (char)(i - 32);
    }
    for (;;)
    {
      GMTrace.o(13249839890432L, 98719);
      return j;
      if ((this.field_conRemarkPYFull != null) && (!this.field_conRemarkPYFull.equals("")))
      {
        i = this.field_conRemarkPYFull.charAt(0);
        break;
      }
      if ((super.qR() != null) && (!super.qR().equals("")))
      {
        i = super.qR().charAt(0);
        break;
      }
      if ((super.qS() != null) && (!super.qS().equals("")))
      {
        i = super.qS().charAt(0);
        break;
      }
      if ((this.field_nickname != null) && (!this.field_nickname.equals("")) && (isLetter(this.field_nickname.charAt(0))))
      {
        i = this.field_nickname.charAt(0);
        break;
      }
      i = j;
      if (this.field_username == null) {
        break;
      }
      i = j;
      if (this.field_username.equals("")) {
        break;
      }
      i = j;
      if (!isLetter(this.field_username.charAt(0))) {
        break;
      }
      i = this.field_username.charAt(0);
      break;
      label258:
      if (i >= 65)
      {
        j = i;
        if (i <= 90) {}
      }
      else
      {
        j = 123;
      }
    }
  }
  
  public final void uy()
  {
    GMTrace.i(13249974108160L, 98720);
    setType(0);
    GMTrace.o(13249974108160L, 98720);
  }
  
  public final void uz()
  {
    GMTrace.i(13250108325888L, 98721);
    setType(this.field_type | 0x4);
    GMTrace.o(13250108325888L, 98721);
  }
  
  public final boolean va()
  {
    GMTrace.i(16765673275392L, 124914);
    if ((0x80000 & this.field_type) != 0)
    {
      GMTrace.o(16765673275392L, 124914);
      return true;
    }
    GMTrace.o(16765673275392L, 124914);
    return false;
  }
  
  public final boolean vb()
  {
    GMTrace.i(13253463769088L, 98746);
    if ((this.field_type & 0x40) != 0)
    {
      GMTrace.o(13253463769088L, 98746);
      return true;
    }
    GMTrace.o(13253463769088L, 98746);
    return false;
  }
  
  public final boolean vc()
  {
    GMTrace.i(13253597986816L, 98747);
    if ((this.field_type & 0x200) != 0)
    {
      GMTrace.o(13253597986816L, 98747);
      return true;
    }
    GMTrace.o(13253597986816L, 98747);
    return false;
  }
  
  public final boolean vd()
  {
    GMTrace.i(13253732204544L, 98748);
    if ((this.field_type & 0x400) == 0)
    {
      GMTrace.o(13253732204544L, 98748);
      return true;
    }
    GMTrace.o(13253732204544L, 98748);
    return false;
  }
  
  public final boolean ve()
  {
    GMTrace.i(13253866422272L, 98749);
    if ((this.field_type & 0x100) != 0)
    {
      GMTrace.o(13253866422272L, 98749);
      return true;
    }
    GMTrace.o(13253866422272L, 98749);
    return false;
  }
  
  public final boolean vf()
  {
    GMTrace.i(13254000640000L, 98750);
    if ((this.field_type & 0x800) != 0)
    {
      GMTrace.o(13254000640000L, 98750);
      return true;
    }
    GMTrace.o(13254000640000L, 98750);
    return false;
  }
  
  public final boolean vg()
  {
    GMTrace.i(13254134857728L, 98751);
    if ((0x8000 & this.field_type) != 0)
    {
      GMTrace.o(13254134857728L, 98751);
      return true;
    }
    GMTrace.o(13254134857728L, 98751);
    return false;
  }
  
  public final void vh()
  {
    GMTrace.i(13254269075456L, 98752);
    setType(this.field_type | 0x8000);
    GMTrace.o(13254269075456L, 98752);
  }
  
  public final int vi()
  {
    GMTrace.i(13254537510912L, 98754);
    int i = (int)this.fTq;
    GMTrace.o(13254537510912L, 98754);
    return i;
  }
  
  public final String vj()
  {
    GMTrace.i(13255074381824L, 98758);
    if (fTr != null) {}
    for (String str = fTr.bN(this.field_username); str != null; str = null)
    {
      GMTrace.o(13255074381824L, 98758);
      return str;
    }
    if ((this.field_nickname == null) || (this.field_nickname.length() <= 0))
    {
      str = vl();
      GMTrace.o(13255074381824L, 98758);
      return str;
    }
    str = this.field_nickname;
    GMTrace.o(13255074381824L, 98758);
    return str;
  }
  
  public final String vk()
  {
    GMTrace.i(13255208599552L, 98759);
    if ((this.field_conRemark != null) && (!this.field_conRemark.trim().equals("")))
    {
      str = this.field_conRemark;
      GMTrace.o(13255208599552L, 98759);
      return str;
    }
    String str = vj();
    GMTrace.o(13255208599552L, 98759);
    return str;
  }
  
  public final String vl()
  {
    GMTrace.i(13255342817280L, 98760);
    String str = qQ();
    if (!bg.nm(str))
    {
      GMTrace.o(13255342817280L, 98760);
      return str;
    }
    str = eh(this.field_username);
    if ((str != null) && (str.length() != 0))
    {
      GMTrace.o(13255342817280L, 98760);
      return str;
    }
    str = this.field_username;
    GMTrace.o(13255342817280L, 98760);
    return str;
  }
  
  public final int vm()
  {
    GMTrace.i(13255611252736L, 98762);
    int i = super.getSource();
    GMTrace.o(13255611252736L, 98762);
    return i;
  }
  
  public final void w(long paramLong)
  {
    GMTrace.i(13259235131392L, 98789);
    if (!bg.B(this.fjc, paramLong))
    {
      super.w(paramLong);
      vn();
    }
    GMTrace.o(13259235131392L, 98789);
  }
  
  public static abstract interface a
  {
    public abstract String bN(String paramString);
    
    public abstract String bO(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\l\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */