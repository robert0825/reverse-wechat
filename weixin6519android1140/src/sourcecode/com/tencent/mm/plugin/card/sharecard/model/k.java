package com.tencent.mm.plugin.card.sharecard.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class k
  extends i<ShareCardInfo>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(5068866715648L, 37766);
    fTX = new String[] { i.a(ShareCardInfo.fTp, "ShareCardInfo") };
    GMTrace.o(5068866715648L, 37766);
  }
  
  public k(e parame)
  {
    super(parame, ShareCardInfo.fTp, "ShareCardInfo", null);
    GMTrace.i(5067658756096L, 37757);
    this.fTZ = parame;
    GMTrace.o(5067658756096L, 37757);
  }
  
  public static String lJ(int paramInt)
  {
    GMTrace.i(5067524538368L, 37756);
    Object localObject = new StringBuilder();
    ArrayList localArrayList = b.lG(paramInt);
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      ((StringBuilder)localObject).append(" (");
      paramInt = 0;
      while (paramInt < localArrayList.size())
      {
        if (paramInt != 0) {
          ((StringBuilder)localObject).append(" OR ");
        }
        ((StringBuilder)localObject).append("card_id").append(" = '" + (String)localArrayList.get(paramInt) + "' ");
        paramInt += 1;
      }
      ((StringBuilder)localObject).append(") AND ");
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(5067524538368L, 37756);
      return (String)localObject;
    }
    GMTrace.o(5067524538368L, 37756);
    return "";
  }
  
  public final String bE(String paramString1, String paramString2)
  {
    GMTrace.i(5068195627008L, 37761);
    w.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId()");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString2 + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 2");
    paramString2 = "select ShareCardInfo.card_id from ShareCardInfo" + ((StringBuilder)localObject).toString();
    Cursor localCursor = this.fTZ.a(paramString2, null, 2);
    if (localCursor == null)
    {
      w.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), cursor == null");
      GMTrace.o(5068195627008L, 37761);
      return "";
    }
    int i = localCursor.getColumnIndex("card_id");
    if (i == -1)
    {
      w.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), index is wrong");
      localCursor.close();
      GMTrace.o(5068195627008L, 37761);
      return "";
    }
    paramString2 = "";
    while (localCursor.moveToNext())
    {
      localObject = localCursor.getString(i);
      paramString2 = (String)localObject;
      if (paramString1 != null)
      {
        paramString2 = (String)localObject;
        if (!paramString1.equals(localObject)) {
          paramString2 = (String)localObject;
        }
      }
    }
    localCursor.close();
    GMTrace.o(5068195627008L, 37761);
    return paramString2;
  }
  
  public final boolean lK(int paramInt)
  {
    GMTrace.i(5068329844736L, 37762);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (");
    ((StringBuilder)localObject).append("categoryType").append(" = '" + paramInt + "'");
    ((StringBuilder)localObject).append(")");
    localObject = "update ShareCardInfo set categoryType = '0' , itemIndex = '0' " + ((StringBuilder)localObject).toString();
    boolean bool = this.fTZ.eZ("ShareCardInfo", (String)localObject);
    localObject = new StringBuilder("resetCategoryInfo updateRet is ");
    if (bool) {}
    for (paramInt = 1;; paramInt = 0)
    {
      w.i("MicroMsg.ShareCardInfoStorage", paramInt);
      GMTrace.o(5068329844736L, 37762);
      return bool;
    }
  }
  
  public final ArrayList<String> ug(String paramString)
  {
    GMTrace.i(5067792973824L, 37758);
    w.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), limit is 99");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 99");
    localObject = "select ShareCardInfo.from_username from ShareCardInfo" + ((StringBuilder)localObject).toString();
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null)
    {
      w.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), cursor == null");
      GMTrace.o(5067792973824L, 37758);
      return null;
    }
    int i = ((Cursor)localObject).getColumnIndex("from_username");
    if (i == -1)
    {
      w.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), index is wrong");
      ((Cursor)localObject).close();
      GMTrace.o(5067792973824L, 37758);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      if (((Cursor)localObject).moveToNext())
      {
        String str = ((Cursor)localObject).getString(i);
        if ((TextUtils.isEmpty(str)) || (localArrayList.contains(str))) {
          break label261;
        }
        localArrayList.add(str);
      }
      while (localArrayList.size() >= 99)
      {
        ((Cursor)localObject).close();
        GMTrace.o(5067792973824L, 37758);
        return localArrayList;
        label261:
        w.e("MicroMsg.ShareCardInfoStorage", "the field_from_username is empty or username is added!, the card id is " + paramString);
      }
    }
  }
  
  public final int uh(String paramString)
  {
    int i = 0;
    GMTrace.i(5067927191552L, 37759);
    w.i("MicroMsg.ShareCardInfoStorage", "getNormalCount()");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" where ( status=0) ");
    localStringBuilder.append(" AND (card_tp_id = '" + paramString + "' )");
    paramString = "select count(*) from ShareCardInfo" + localStringBuilder.toString();
    paramString = this.fTZ.a(paramString, null, 2);
    if (paramString == null)
    {
      w.i("MicroMsg.ShareCardInfoStorage", "getNormalCount(), cursor == null");
      GMTrace.o(5067927191552L, 37759);
      return 0;
    }
    if (paramString.moveToFirst()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    GMTrace.o(5067927191552L, 37759);
    return i;
  }
  
  public final String ui(String paramString)
  {
    GMTrace.i(5068061409280L, 37760);
    w.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId()");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 1");
    paramString = "select ShareCardInfo.card_id from ShareCardInfo" + ((StringBuilder)localObject).toString();
    localObject = this.fTZ.a(paramString, null, 2);
    if (localObject == null)
    {
      w.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), cursor == null");
      GMTrace.o(5068061409280L, 37760);
      return "";
    }
    int i = ((Cursor)localObject).getColumnIndex("card_id");
    if (i == -1)
    {
      w.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), index is wrong");
      ((Cursor)localObject).close();
      GMTrace.o(5068061409280L, 37760);
      return "";
    }
    paramString = "";
    if (((Cursor)localObject).moveToFirst()) {
      paramString = ((Cursor)localObject).getString(i);
    }
    ((Cursor)localObject).close();
    GMTrace.o(5068061409280L, 37760);
    return paramString;
  }
  
  public final void uj(String paramString)
  {
    GMTrace.i(5068598280192L, 37764);
    paramString = "delete from ShareCardInfo where card_id = '" + paramString + "'";
    this.fTZ.eZ("ShareCardInfo", paramString);
    GMTrace.o(5068598280192L, 37764);
  }
  
  public final ShareCardInfo uk(String paramString)
  {
    GMTrace.i(5068732497920L, 37765);
    ShareCardInfo localShareCardInfo = new ShareCardInfo();
    localShareCardInfo.field_card_id = paramString;
    if (super.b(localShareCardInfo, new String[0]))
    {
      GMTrace.o(5068732497920L, 37765);
      return localShareCardInfo;
    }
    GMTrace.o(5068732497920L, 37765);
    return null;
  }
  
  public final boolean z(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(5068464062464L, 37763);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" where ( status=0) ");
    localStringBuilder.append(" AND (card_tp_id = '" + paramString + "' )");
    paramString = "update ShareCardInfo set categoryType = '" + paramInt1 + "', itemIndex = '" + paramInt2 + "' " + localStringBuilder.toString();
    boolean bool = this.fTZ.eZ("ShareCardInfo", paramString);
    paramString = new StringBuilder("updateCategoryInfo updateRet is ");
    if (bool) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      w.i("MicroMsg.ShareCardInfoStorage", paramInt1);
      GMTrace.o(5068464062464L, 37763);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */