package com.tencent.mm.af;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.y;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends y
{
  protected static c.a fTp;
  public static int gvH;
  public static int gvI;
  public static int gvJ;
  private static int gvM;
  private static b gvN;
  private List<a> gvK;
  public b gvL;
  
  static
  {
    GMTrace.i(4548370366464L, 33888);
    gvH = 1;
    gvI = 0;
    gvJ = 1;
    c.a locala = new c.a();
    locala.gZM = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.vmt.put("username", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" username TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "username";
    locala.columns[1] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "brandList";
    locala.vmt.put("brandList", "TEXT default '' ");
    localStringBuilder.append(" brandList TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "brandListVersion";
    locala.vmt.put("brandListVersion", "TEXT");
    localStringBuilder.append(" brandListVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "brandListContent";
    locala.vmt.put("brandListContent", "TEXT");
    localStringBuilder.append(" brandListContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "brandFlag";
    locala.vmt.put("brandFlag", "INTEGER");
    localStringBuilder.append(" brandFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "extInfo";
    locala.vmt.put("extInfo", "TEXT");
    localStringBuilder.append(" extInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "brandInfo";
    locala.vmt.put("brandInfo", "TEXT");
    localStringBuilder.append(" brandInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "brandIconURL";
    locala.vmt.put("brandIconURL", "TEXT");
    localStringBuilder.append(" brandIconURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "updateTime";
    locala.vmt.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "hadAlert";
    locala.vmt.put("hadAlert", "INTEGER");
    localStringBuilder.append(" hadAlert INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "acceptType";
    locala.vmt.put("acceptType", "INTEGER default '0' ");
    localStringBuilder.append(" acceptType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "type";
    locala.vmt.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "status";
    locala.vmt.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "enterpriseFather";
    locala.vmt.put("enterpriseFather", "TEXT");
    localStringBuilder.append(" enterpriseFather TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "kfWorkerId";
    locala.vmt.put("kfWorkerId", "TEXT");
    localStringBuilder.append(" kfWorkerId TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "specialType";
    locala.vmt.put("specialType", "INTEGER");
    localStringBuilder.append(" specialType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "attrSyncVersion";
    locala.vmt.put("attrSyncVersion", "TEXT");
    localStringBuilder.append(" attrSyncVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "incrementUpdateTime";
    locala.vmt.put("incrementUpdateTime", "LONG");
    localStringBuilder.append(" incrementUpdateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[19] = "bitFlag";
    locala.vmt.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    locala.columns[20] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    gvM = 0;
    gvN = null;
    GMTrace.o(4548370366464L, 33888);
  }
  
  public d()
  {
    GMTrace.i(4545283358720L, 33865);
    GMTrace.o(4545283358720L, 33865);
  }
  
  private boolean fN(int paramInt)
  {
    GMTrace.i(4548101931008L, 33886);
    if ((this.field_bitFlag & paramInt) != 0)
    {
      GMTrace.o(4548101931008L, 33886);
      return true;
    }
    GMTrace.o(4548101931008L, 33886);
    return false;
  }
  
  private void fO(int paramInt)
  {
    GMTrace.i(4548236148736L, 33887);
    this.field_bitFlag |= paramInt;
    GMTrace.o(4548236148736L, 33887);
  }
  
  public final void EA()
  {
    GMTrace.i(4546088665088L, 33871);
    bq(false);
    b localb = this.gvL;
    if (localb.gvP != null) {
      localb.gwd = localb.gvP.optInt("ConnectorMsgType");
    }
    this.field_acceptType = localb.gwd;
    this.field_type = bq(false).Fd();
    if (EH())
    {
      fO(1);
      GMTrace.o(4546088665088L, 33871);
      return;
    }
    this.field_bitFlag &= 0xFFFFFFFE;
    GMTrace.o(4546088665088L, 33871);
  }
  
  public final boolean EB()
  {
    GMTrace.i(4546222882816L, 33872);
    bq(false);
    w.i("MicroMsg.BizInfo", "is report location, user %s %B", new Object[] { this.field_username, Boolean.valueOf(this.gvL.EB()) });
    boolean bool = this.gvL.EB();
    GMTrace.o(4546222882816L, 33872);
    return bool;
  }
  
  public final boolean EC()
  {
    GMTrace.i(4546357100544L, 33873);
    bq(false);
    if (this.field_type == 1)
    {
      GMTrace.o(4546357100544L, 33873);
      return true;
    }
    GMTrace.o(4546357100544L, 33873);
    return false;
  }
  
  public final boolean ED()
  {
    GMTrace.i(4546491318272L, 33874);
    bq(false);
    if (this.field_type == 0)
    {
      GMTrace.o(4546491318272L, 33874);
      return true;
    }
    GMTrace.o(4546491318272L, 33874);
    return false;
  }
  
  public final boolean EE()
  {
    GMTrace.i(4546625536000L, 33875);
    bq(false);
    if ((this.field_type == 2) || (this.field_type == 3))
    {
      GMTrace.o(4546625536000L, 33875);
      return true;
    }
    GMTrace.o(4546625536000L, 33875);
    return false;
  }
  
  public final boolean EF()
  {
    GMTrace.i(4546759753728L, 33876);
    bq(false);
    if (this.field_type == 2)
    {
      GMTrace.o(4546759753728L, 33876);
      return true;
    }
    GMTrace.o(4546759753728L, 33876);
    return false;
  }
  
  public final boolean EG()
  {
    GMTrace.i(4546893971456L, 33877);
    bq(false);
    if (this.field_type == 3)
    {
      GMTrace.o(4546893971456L, 33877);
      return true;
    }
    GMTrace.o(4546893971456L, 33877);
    return false;
  }
  
  public final boolean EH()
  {
    GMTrace.i(4547028189184L, 33878);
    bq(false);
    boolean bool1;
    if ((this.gvL != null) && (this.gvL.Fh() != null)) {
      if (this.gvL.gwa.gwA == 1)
      {
        bool1 = true;
        if ((bool1) && (!fN(1)))
        {
          fO(1);
          x.FG().e(this);
        }
        bool2 = bool1;
        if (bool1) {
          w.d("MicroMsg.BizInfo", "EnterpriseChat,userName : %s", new Object[] { this.field_username });
        }
      }
    }
    for (boolean bool2 = bool1;; bool2 = false)
    {
      GMTrace.o(4547028189184L, 33878);
      return bool2;
      bool1 = false;
      break;
    }
  }
  
  public final boolean EI()
  {
    GMTrace.i(4547162406912L, 33879);
    bq(false);
    boolean bool1;
    if ((this.gvL != null) && (this.gvL.Fh() != null)) {
      if (this.gvL.gwa.gwA == 2)
      {
        bool1 = true;
        if ((bool1) && (!fN(2)))
        {
          fO(2);
          x.FG().e(this);
        }
        bool2 = bool1;
        if (bool1) {
          w.d("MicroMsg.BizInfo", "EnterpriseWeb,userName : %s", new Object[] { this.field_username });
        }
      }
    }
    for (boolean bool2 = bool1;; bool2 = false)
    {
      GMTrace.o(4547162406912L, 33879);
      return bool2;
      bool1 = false;
      break;
    }
  }
  
  public final String EJ()
  {
    GMTrace.i(4547296624640L, 33880);
    bq(false);
    if (this.gvL != null)
    {
      Object localObject = this.gvL.Fh();
      if ((localObject != null) && (((d.b.b.a)localObject).gwB != null) && (!((d.b.b.a)localObject).gwB.isEmpty()))
      {
        localObject = ((d.b.b.a)localObject).gwB;
        GMTrace.o(4547296624640L, 33880);
        return (String)localObject;
      }
    }
    GMTrace.o(4547296624640L, 33880);
    return null;
  }
  
  public final long EK()
  {
    GMTrace.i(18486076112896L, 137732);
    bq(false);
    if (this.gvL != null)
    {
      d.b.b.a locala = this.gvL.Fh();
      if ((locala != null) && (locala.appid != 0L))
      {
        long l = locala.appid;
        GMTrace.o(18486076112896L, 137732);
        return l;
      }
    }
    GMTrace.o(18486076112896L, 137732);
    return 0L;
  }
  
  public final boolean EL()
  {
    GMTrace.i(20769119666176L, 154742);
    bq(false);
    if (this.gvL == null)
    {
      w.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo() null");
      GMTrace.o(20769119666176L, 154742);
      return true;
    }
    if (this.gvL.Fb() == null)
    {
      w.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo().getRegisterSource() null");
      GMTrace.o(20769119666176L, 154742);
      return true;
    }
    if (!this.gvL.Fb().gwP)
    {
      GMTrace.o(20769119666176L, 154742);
      return true;
    }
    GMTrace.o(20769119666176L, 154742);
    return false;
  }
  
  public final String EM()
  {
    GMTrace.i(4547430842368L, 33881);
    bq(false);
    if (this.gvL != null)
    {
      Object localObject = this.gvL.Fh();
      if (localObject != null)
      {
        localObject = ((d.b.b.a)localObject).gwC;
        GMTrace.o(4547430842368L, 33881);
        return (String)localObject;
      }
    }
    GMTrace.o(4547430842368L, 33881);
    return null;
  }
  
  public final String EN()
  {
    GMTrace.i(4547565060096L, 33882);
    String str = bq(false).Fh().gwy;
    if (bg.nm(str)) {
      w.e("MicroMsg.BizInfo", "check father: %s, %s", new Object[] { this.field_username, str });
    }
    GMTrace.o(4547565060096L, 33882);
    return str;
  }
  
  /* Error */
  public final List<a> EO()
  {
    // Byte code:
    //   0: ldc2_w 417
    //   3: ldc_w 419
    //   6: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 421	com/tencent/mm/af/d:gvK	Ljava/util/List;
    //   13: ifnull +19 -> 32
    //   16: aload_0
    //   17: getfield 421	com/tencent/mm/af/d:gvK	Ljava/util/List;
    //   20: astore_2
    //   21: ldc2_w 417
    //   24: ldc_w 419
    //   27: invokestatic 208	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: aload_2
    //   31: areturn
    //   32: aload_0
    //   33: new 423	java/util/LinkedList
    //   36: dup
    //   37: invokespecial 424	java/util/LinkedList:<init>	()V
    //   40: putfield 421	com/tencent/mm/af/d:gvK	Ljava/util/List;
    //   43: aload_0
    //   44: getfield 427	com/tencent/mm/af/d:field_brandInfo	Ljava/lang/String;
    //   47: ifnull +13 -> 60
    //   50: aload_0
    //   51: getfield 427	com/tencent/mm/af/d:field_brandInfo	Ljava/lang/String;
    //   54: invokevirtual 430	java/lang/String:length	()I
    //   57: ifne +19 -> 76
    //   60: aload_0
    //   61: getfield 421	com/tencent/mm/af/d:gvK	Ljava/util/List;
    //   64: astore_2
    //   65: ldc2_w 417
    //   68: ldc_w 419
    //   71: invokestatic 208	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   74: aload_2
    //   75: areturn
    //   76: new 244	org/json/JSONObject
    //   79: dup
    //   80: aload_0
    //   81: getfield 427	com/tencent/mm/af/d:field_brandInfo	Ljava/lang/String;
    //   84: invokespecial 433	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   87: ldc_w 435
    //   90: invokevirtual 439	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   93: astore_2
    //   94: iconst_0
    //   95: istore_1
    //   96: iload_1
    //   97: aload_2
    //   98: invokevirtual 442	org/json/JSONArray:length	()I
    //   101: if_icmpge +105 -> 206
    //   104: new 6	com/tencent/mm/af/d$a
    //   107: dup
    //   108: invokespecial 443	com/tencent/mm/af/d$a:<init>	()V
    //   111: astore_3
    //   112: aload_2
    //   113: iload_1
    //   114: invokevirtual 447	org/json/JSONArray:optJSONObject	(I)Lorg/json/JSONObject;
    //   117: astore 4
    //   119: aload_3
    //   120: aload 4
    //   122: ldc_w 449
    //   125: invokevirtual 453	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   128: putfield 455	com/tencent/mm/af/d$a:title	Ljava/lang/String;
    //   131: aload_3
    //   132: aload 4
    //   134: ldc_w 457
    //   137: invokevirtual 453	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   140: putfield 459	com/tencent/mm/af/d$a:url	Ljava/lang/String;
    //   143: aload_3
    //   144: aload 4
    //   146: ldc_w 461
    //   149: invokevirtual 453	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   152: putfield 464	com/tencent/mm/af/d$a:gvO	Ljava/lang/String;
    //   155: aload_3
    //   156: aload 4
    //   158: ldc_w 466
    //   161: invokevirtual 453	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   164: putfield 468	com/tencent/mm/af/d$a:description	Ljava/lang/String;
    //   167: aload_0
    //   168: getfield 421	com/tencent/mm/af/d:gvK	Ljava/util/List;
    //   171: aload_3
    //   172: invokeinterface 474 2 0
    //   177: pop
    //   178: iload_1
    //   179: iconst_1
    //   180: iadd
    //   181: istore_1
    //   182: goto -86 -> 96
    //   185: astore_2
    //   186: ldc_w 273
    //   189: ldc_w 476
    //   192: iconst_1
    //   193: anewarray 277	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload_2
    //   199: invokestatic 479	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   202: aastore
    //   203: invokestatic 412	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: aload_0
    //   207: getfield 421	com/tencent/mm/af/d:gvK	Ljava/util/List;
    //   210: astore_2
    //   211: ldc2_w 417
    //   214: ldc_w 419
    //   217: invokestatic 208	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   220: aload_2
    //   221: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	d
    //   95	87	1	i	int
    //   20	93	2	localObject	Object
    //   185	14	2	localException	Exception
    //   210	11	2	localList	List
    //   111	61	3	locala	a
    //   117	40	4	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   76	94	185	java/lang/Exception
    //   96	178	185	java/lang/Exception
  }
  
  public final boolean Ex()
  {
    GMTrace.i(4545686011904L, 33868);
    if ((this.field_brandFlag & 0x1) == 0)
    {
      GMTrace.o(4545686011904L, 33868);
      return true;
    }
    GMTrace.o(4545686011904L, 33868);
    return false;
  }
  
  public final boolean Ey()
  {
    GMTrace.i(4545820229632L, 33869);
    if ((this.field_brandFlag & 0x4) != 0)
    {
      GMTrace.o(4545820229632L, 33869);
      return true;
    }
    GMTrace.o(4545820229632L, 33869);
    return false;
  }
  
  public final boolean Ez()
  {
    GMTrace.i(4545954447360L, 33870);
    if (System.currentTimeMillis() - this.field_updateTime > 86400000L)
    {
      GMTrace.o(4545954447360L, 33870);
      return true;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    if (this.field_updateTime < localCalendar.getTimeInMillis())
    {
      GMTrace.o(4545954447360L, 33870);
      return true;
    }
    GMTrace.o(4545954447360L, 33870);
    return false;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4547699277824L, 33883);
    super.b(paramCursor);
    GMTrace.o(4547699277824L, 33883);
  }
  
  public final b bq(boolean paramBoolean)
  {
    GMTrace.i(4545551794176L, 33867);
    if ((this.gvL == null) || (paramBoolean))
    {
      System.currentTimeMillis();
      if ((bg.nm(this.field_extInfo)) || (gvM != this.field_extInfo.hashCode())) {
        break label70;
      }
      this.gvL = gvN;
    }
    for (;;)
    {
      b localb = this.gvL;
      GMTrace.o(4545551794176L, 33867);
      return localb;
      label70:
      localb = b.iv(this.field_extInfo);
      this.gvL = localb;
      gvN = localb;
      gvM = bg.nl(this.field_extInfo).hashCode();
    }
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4547833495552L, 33884);
    ContentValues localContentValues = super.qL();
    GMTrace.o(4547833495552L, 33884);
    return localContentValues;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4545417576448L, 33866);
    c.a locala = fTp;
    GMTrace.o(4545417576448L, 33866);
    return locala;
  }
  
  public static final class a
  {
    public String description;
    public String gvO;
    public String title;
    public String url;
    
    public a()
    {
      GMTrace.i(4523674304512L, 33704);
      GMTrace.o(4523674304512L, 33704);
    }
  }
  
  public static final class b
  {
    public JSONObject gvP;
    private boolean gvQ;
    public boolean gvR;
    public boolean gvS;
    public boolean gvT;
    private String gvU;
    private String gvV;
    private List<e> gvW;
    private c gvX;
    private b gvY;
    private d gvZ;
    public d.b.b.a gwa;
    private boolean gwb;
    boolean gwc;
    int gwd;
    public boolean gwe;
    public int gwf;
    private int gwg;
    private String gwh;
    private a gwi;
    private int gwj;
    private int gwk;
    private String gwl;
    private boolean gwm;
    public int gwn;
    private f gwo;
    private String gwp;
    private String gwq;
    private boolean gwr;
    private List<WxaAttributes.WxaEntryInfo> gws;
    
    private b()
    {
      GMTrace.i(4534009069568L, 33781);
      this.gvP = null;
      this.gvQ = true;
      this.gvR = false;
      this.gvS = false;
      this.gvT = false;
      this.gvW = null;
      this.gvX = null;
      this.gvY = null;
      this.gvZ = null;
      this.gwa = null;
      this.gwb = false;
      this.gwc = false;
      this.gwe = false;
      this.gwf = 0;
      this.gwg = 0;
      this.gwi = null;
      this.gwj = 0;
      this.gwk = d.gvI;
      this.gwm = false;
      this.gwr = false;
      GMTrace.o(4534009069568L, 33781);
    }
    
    public static b iv(String paramString)
    {
      GMTrace.i(4534143287296L, 33782);
      b localb = new b();
      if (bg.nm(paramString))
      {
        GMTrace.o(4534143287296L, 33782);
        return localb;
      }
      try
      {
        System.currentTimeMillis();
        localb.gvP = new JSONObject(paramString);
        GMTrace.o(4534143287296L, 33782);
        return localb;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          w.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bg.f(paramString) });
        }
      }
    }
    
    public final boolean EB()
    {
      boolean bool = false;
      GMTrace.i(4533203763200L, 33775);
      if (this.gvP != null)
      {
        if (bg.getInt(this.gvP.optString("ReportLocationType"), 0) > 0) {
          bool = true;
        }
        this.gwb = bool;
      }
      bool = this.gwb;
      GMTrace.o(4533203763200L, 33775);
      return bool;
    }
    
    public final List<WxaAttributes.WxaEntryInfo> EP()
    {
      GMTrace.i(4531458932736L, 33762);
      Object localObject1;
      if (this.gws == null)
      {
        this.gws = new LinkedList();
        if (this.gvP != null)
        {
          localObject1 = this.gvP.optString("BindWxaInfo");
          if (TextUtils.isEmpty((CharSequence)localObject1)) {}
        }
      }
      for (;;)
      {
        try
        {
          localObject1 = new JSONObject((String)localObject1);
          if (localObject1 == null) {
            break label230;
          }
          localObject1 = ((JSONObject)localObject1).optJSONArray("wxaEntryInfo");
          if (localObject1 == null) {
            break label215;
          }
          int i = 0;
          if (i >= ((JSONArray)localObject1).length()) {
            break label215;
          }
          Object localObject2 = ((JSONArray)localObject1).optJSONObject(i);
          if (localObject2 != null)
          {
            String str1 = ((JSONObject)localObject2).optString("username");
            String str2 = ((JSONObject)localObject2).optString("title");
            String str3 = ((JSONObject)localObject2).optString("title_key");
            localObject2 = ((JSONObject)localObject2).optString("icon_url");
            if ((!TextUtils.isEmpty(str1)) && ((!TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3))))
            {
              WxaAttributes.WxaEntryInfo localWxaEntryInfo = new WxaAttributes.WxaEntryInfo();
              localWxaEntryInfo.username = str1;
              localWxaEntryInfo.title = str2;
              localWxaEntryInfo.hRX = str3;
              localWxaEntryInfo.iconUrl = ((String)localObject2);
              this.gws.add(localWxaEntryInfo);
            }
          }
          i += 1;
          continue;
          localList = null;
        }
        catch (JSONException localJSONException) {}
        continue;
        label215:
        List localList = this.gws;
        GMTrace.o(4531458932736L, 33762);
        return localList;
        label230:
        localList = null;
      }
    }
    
    public final boolean EQ()
    {
      GMTrace.i(4531593150464L, 33763);
      if ((this.gvP != null) && (this.gvP.optJSONObject("WifiBizInfo") != null) && (this.gvP.optJSONObject("WifiBizInfo").optInt("IsWXWiFi") == 1)) {
        this.gwr = true;
      }
      boolean bool = this.gwr;
      GMTrace.o(4531593150464L, 33763);
      return bool;
    }
    
    public final boolean ER()
    {
      GMTrace.i(4531727368192L, 33764);
      if (this.gvP != null) {
        this.gwk = bg.getInt(this.gvP.optString("NotifyManage"), d.gvI);
      }
      if (this.gwk == d.gvH)
      {
        GMTrace.o(4531727368192L, 33764);
        return true;
      }
      GMTrace.o(4531727368192L, 33764);
      return false;
    }
    
    public final String ES()
    {
      GMTrace.i(4531861585920L, 33765);
      if (this.gvP != null) {
        this.gvU = this.gvP.optString("VerifyContactPromptTitle");
      }
      String str = this.gvU;
      GMTrace.o(4531861585920L, 33765);
      return str;
    }
    
    public final String ET()
    {
      GMTrace.i(4531995803648L, 33766);
      if (this.gvP != null) {
        this.gwp = this.gvP.optString("TrademarkUrl");
      }
      String str = this.gwp;
      GMTrace.o(4531995803648L, 33766);
      return str;
    }
    
    public final String EU()
    {
      GMTrace.i(4532130021376L, 33767);
      if (this.gvP != null) {
        this.gwq = this.gvP.optString("TrademarkName");
      }
      String str = this.gwq;
      GMTrace.o(4532130021376L, 33767);
      return str;
    }
    
    public final String EV()
    {
      GMTrace.i(4532264239104L, 33768);
      if (this.gvP != null) {
        this.gvV = this.gvP.optString("ConferenceContactExpireTime");
      }
      String str = this.gvV;
      GMTrace.o(4532264239104L, 33768);
      return str;
    }
    
    public final List<e> EW()
    {
      GMTrace.i(4532398456832L, 33769);
      if ((this.gvP != null) && (this.gvW == null)) {
        this.gvW = e.b(this.gvP.optJSONArray("Privilege"));
      }
      List localList = this.gvW;
      GMTrace.o(4532398456832L, 33769);
      return localList;
    }
    
    public final int EX()
    {
      GMTrace.i(4532532674560L, 33770);
      if (this.gvP != null) {
        this.gwj = this.gvP.optInt("InteractiveMode");
      }
      int i = this.gwj;
      GMTrace.o(4532532674560L, 33770);
      return i;
    }
    
    public final d EY()
    {
      GMTrace.i(4532666892288L, 33771);
      if ((this.gvP != null) && (this.gvZ == null)) {
        this.gvZ = d.iA(this.gvP.optString("PayShowInfo"));
      }
      d locald = this.gvZ;
      GMTrace.o(4532666892288L, 33771);
      return locald;
    }
    
    public final a EZ()
    {
      GMTrace.i(4532801110016L, 33772);
      if ((this.gvP != null) && (this.gwi == null))
      {
        localObject = this.gvP.optString("HardwareBizInfo");
        if (localObject != null) {
          this.gwi = a.iw((String)localObject);
        }
      }
      Object localObject = this.gwi;
      GMTrace.o(4532801110016L, 33772);
      return (a)localObject;
    }
    
    public final c Fa()
    {
      GMTrace.i(4532935327744L, 33773);
      if ((this.gvP != null) && (this.gvX == null)) {
        this.gvX = c.iz(this.gvP.optString("VerifySource"));
      }
      c localc = this.gvX;
      GMTrace.o(4532935327744L, 33773);
      return localc;
    }
    
    public final f Fb()
    {
      GMTrace.i(4533069545472L, 33774);
      if ((this.gvP != null) && (this.gwo == null))
      {
        localObject = this.gvP.optString("RegisterSource");
        if (localObject != null) {
          this.gwo = f.iB((String)localObject);
        }
      }
      Object localObject = this.gwo;
      GMTrace.o(4533069545472L, 33774);
      return (f)localObject;
    }
    
    public final boolean Fc()
    {
      boolean bool = true;
      GMTrace.i(4533337980928L, 33776);
      if (this.gvP != null) {
        if (bg.getInt(this.gvP.optString("IsTrademarkProtection"), 0) != 1) {
          break label57;
        }
      }
      for (;;)
      {
        this.gwm = bool;
        bool = this.gwm;
        GMTrace.o(4533337980928L, 33776);
        return bool;
        label57:
        bool = false;
      }
    }
    
    public final int Fd()
    {
      GMTrace.i(4533472198656L, 33777);
      if (this.gvP != null) {
        this.gwg = this.gvP.optInt("ServiceType", 0);
      }
      int i = this.gwg;
      GMTrace.o(4533472198656L, 33777);
      return i;
    }
    
    public final String Fe()
    {
      GMTrace.i(4533606416384L, 33778);
      if (this.gvP != null) {
        this.gwh = this.gvP.optString("SupportEmoticonLinkPrefix");
      }
      String str = this.gwh;
      GMTrace.o(4533606416384L, 33778);
      return str;
    }
    
    public final b Ff()
    {
      GMTrace.i(4533740634112L, 33779);
      if ((this.gvP != null) && (this.gvY == null))
      {
        localObject = this.gvP.optString("MMBizMenu");
        if (localObject != null) {
          this.gvY = b.ix((String)localObject);
        }
      }
      Object localObject = this.gvY;
      GMTrace.o(4533740634112L, 33779);
      return (b)localObject;
    }
    
    public final String Fg()
    {
      GMTrace.i(4533874851840L, 33780);
      if (this.gvP != null) {
        this.gwl = this.gvP.optString("ServicePhone");
      }
      String str = this.gwl;
      GMTrace.o(4533874851840L, 33780);
      return str;
    }
    
    public final d.b.b.a Fh()
    {
      GMTrace.i(4534277505024L, 33783);
      if ((this.gvP != null) && (this.gwa == null))
      {
        localObject = this.gvP.optString("EnterpriseBizInfo");
        if (localObject != null) {
          this.gwa = d.b.b.a.iy((String)localObject);
        }
      }
      Object localObject = this.gwa;
      GMTrace.o(4534277505024L, 33783);
      return (d.b.b.a)localObject;
    }
    
    public static final class a
    {
      public int gwt;
      public int gwu;
      public int gwv;
      
      public a()
      {
        GMTrace.i(4538438254592L, 33814);
        GMTrace.o(4538438254592L, 33814);
      }
      
      public static a iw(String paramString)
      {
        GMTrace.i(4538572472320L, 33815);
        w.i("MicroMsg.BizInfo", "HardwareBizInfo = " + paramString);
        a locala = new a();
        if ((paramString == null) || (paramString.length() <= 0))
        {
          GMTrace.o(4538572472320L, 33815);
          return locala;
        }
        try
        {
          paramString = new JSONObject(paramString);
          locala.gwt = paramString.optInt("hardware_flag");
          locala.gwu = paramString.optInt("connect_status_display_mode");
          locala.gwv = paramString.optInt("special_internal_brand_type");
          GMTrace.o(4538572472320L, 33815);
          return locala;
        }
        catch (JSONException paramString)
        {
          for (;;)
          {
            w.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bg.f(paramString) });
          }
        }
      }
      
      public final boolean Fi()
      {
        GMTrace.i(4538706690048L, 33816);
        if ((this.gwt & 0x1) > 0)
        {
          GMTrace.o(4538706690048L, 33816);
          return true;
        }
        GMTrace.o(4538706690048L, 33816);
        return false;
      }
    }
    
    public static final class b
    {
      public int gww;
      public List<j> gwx;
      public int type;
      
      public b()
      {
        GMTrace.i(4536559206400L, 33800);
        this.gwx = null;
        GMTrace.o(4536559206400L, 33800);
      }
      
      public static b ix(String paramString)
      {
        GMTrace.i(4536693424128L, 33801);
        w.i("MicroMsg.BizInfo", "MenuInfo = " + paramString);
        b localb = new b();
        if ((paramString == null) || (paramString.length() <= 0))
        {
          GMTrace.o(4536693424128L, 33801);
          return localb;
        }
        try
        {
          paramString = new JSONObject(paramString);
          localb.gww = paramString.optInt("update_time");
          localb.type = paramString.optInt("type", 0);
          localb.gwx = j.c(paramString.optJSONArray("button_list"));
          GMTrace.o(4536693424128L, 33801);
          return localb;
        }
        catch (JSONException paramString)
        {
          for (;;)
          {
            w.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bg.f(paramString) });
          }
        }
      }
      
      public static final class a
      {
        public long appid;
        public int gwA;
        public String gwB;
        public String gwC;
        public String gwy;
        public String gwz;
        
        public a()
        {
          GMTrace.i(4583803846656L, 34152);
          this.appid = 0L;
          GMTrace.o(4583803846656L, 34152);
        }
        
        public static a iy(String paramString)
        {
          GMTrace.i(4583938064384L, 34153);
          w.i("MicroMsg.BizInfo", "EnterpriseBizInfo = " + paramString);
          a locala = new a();
          if ((paramString == null) || (paramString.length() <= 0))
          {
            GMTrace.o(4583938064384L, 34153);
            return locala;
          }
          try
          {
            paramString = new JSONObject(paramString);
            locala.gwy = paramString.optString("belong");
            locala.gwz = paramString.optString("freeze_wording");
            locala.gwA = paramString.optInt("child_type");
            locala.gwB = paramString.optString("home_url");
            paramString = paramString.optString("exattr");
            if (bg.nm(paramString)) {
              locala.gwC = null;
            }
            for (;;)
            {
              GMTrace.o(4583938064384L, 34153);
              return locala;
              paramString = new JSONObject(paramString);
              locala.gwC = paramString.optString("chat_extension_url");
              locala.appid = paramString.optLong("app_id");
            }
          }
          catch (JSONException paramString)
          {
            for (;;)
            {
              w.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bg.f(paramString) });
            }
          }
        }
      }
    }
    
    public static final class c
    {
      public int gwD;
      public String gwE;
      public String gwF;
      public String gwG;
      public String gwH;
      
      public c()
      {
        GMTrace.i(4550383632384L, 33903);
        this.gwD = 0;
        GMTrace.o(4550383632384L, 33903);
      }
      
      public static c iz(String paramString)
      {
        GMTrace.i(4550517850112L, 33904);
        if (bg.nm(paramString))
        {
          GMTrace.o(4550517850112L, 33904);
          return null;
        }
        w.i("MicroMsg.BizInfo", "biz verify info is [%s]", new Object[] { paramString });
        c localc = new c();
        try
        {
          paramString = new JSONObject(paramString);
          localc.gwD = paramString.optInt("Type");
          localc.gwE = paramString.optString("Description");
          localc.gwF = paramString.optString("Name");
          localc.gwG = paramString.optString("IntroUrl");
          localc.gwH = paramString.optString("VerifySubTitle");
          w.i("MicroMsg.BizInfo", "type[%d],desc[%s],name[%s],url[%s]", new Object[] { Integer.valueOf(localc.gwD), localc.gwE, localc.gwF, localc.gwG });
          GMTrace.o(4550517850112L, 33904);
          return localc;
        }
        catch (Exception paramString)
        {
          for (;;)
          {
            w.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bg.f(paramString) });
          }
        }
      }
    }
    
    public static final class d
    {
      public int gwI;
      public String gwJ;
      public List<String> gwK;
      public String gwL;
      
      public d()
      {
        GMTrace.i(4523808522240L, 33705);
        GMTrace.o(4523808522240L, 33705);
      }
      
      public static d iA(String paramString)
      {
        GMTrace.i(4523942739968L, 33706);
        if (bg.nm(paramString))
        {
          GMTrace.o(4523942739968L, 33706);
          return null;
        }
        try
        {
          d locald = new d();
          paramString = new JSONObject(paramString);
          locald.gwI = paramString.optInt("reputation_level", -1);
          locald.gwJ = paramString.optString("scope_of_business");
          locald.gwL = paramString.optString("guarantee_detail_h5_url");
          paramString = paramString.optJSONArray("guarantee_info");
          if (paramString != null)
          {
            int j = paramString.length();
            if (j > 0)
            {
              locald.gwK = new ArrayList();
              int i = 0;
              while (i < j)
              {
                String str = paramString.getString(i);
                if (!bg.nm(str)) {
                  locald.gwK.add(str);
                }
                i += 1;
              }
            }
          }
          GMTrace.o(4523942739968L, 33706);
          return locald;
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bg.f(paramString) });
          GMTrace.o(4523942739968L, 33706);
        }
        return null;
      }
    }
    
    public static final class e
    {
      public String description;
      public String gwM;
      public String iconUrl;
      
      public e()
      {
        GMTrace.i(4545014923264L, 33863);
        GMTrace.o(4545014923264L, 33863);
      }
      
      public static List<e> b(JSONArray paramJSONArray)
      {
        GMTrace.i(4545149140992L, 33864);
        localLinkedList = new LinkedList();
        if (paramJSONArray == null)
        {
          GMTrace.o(4545149140992L, 33864);
          return localLinkedList;
        }
        try
        {
          int j = paramJSONArray.length();
          int i = 0;
          while (i < j)
          {
            e locale = new e();
            JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
            locale.iconUrl = localJSONObject.optString("icon");
            locale.description = localJSONObject.optString("description");
            locale.gwM = localJSONObject.optString("description_key");
            localLinkedList.add(locale);
            i += 1;
          }
          return localLinkedList;
        }
        catch (Exception paramJSONArray)
        {
          w.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bg.f(paramJSONArray) });
          GMTrace.o(4545149140992L, 33864);
        }
      }
    }
    
    public static final class f
    {
      public String gwN;
      public String gwO;
      public boolean gwP;
      
      public f()
      {
        GMTrace.i(4539377778688L, 33821);
        GMTrace.o(4539377778688L, 33821);
      }
      
      public static f iB(String paramString)
      {
        GMTrace.i(4539511996416L, 33822);
        w.i("MicroMsg.BizInfo", "RegisterSource = %s", new Object[] { paramString });
        f localf = new f();
        if ((paramString == null) || (paramString.length() <= 0))
        {
          GMTrace.o(4539511996416L, 33822);
          return localf;
        }
        for (;;)
        {
          try
          {
            paramString = new JSONObject(paramString);
            localf.gwN = paramString.optString("RegisterBody");
            localf.gwO = paramString.optString("IntroUrl");
            if (paramString.optInt("IsClose", 0) != 1) {
              continue;
            }
            bool = true;
            localf.gwP = bool;
          }
          catch (JSONException paramString)
          {
            boolean bool;
            w.e("MicroMsg.BizInfo", "exception in RegisterSource:%s", new Object[] { bg.f(paramString) });
            continue;
          }
          GMTrace.o(4539511996416L, 33822);
          return localf;
          bool = false;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */