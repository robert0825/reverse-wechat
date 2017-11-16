package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

public class AddCardToWXCardPackage
{
  private static final String TAG = "MicroMsg.AddCardToWXCardPackage";
  
  public AddCardToWXCardPackage()
  {
    GMTrace.i(12348030976L, 92);
    GMTrace.o(12348030976L, 92);
  }
  
  public static class Req
    extends BaseReq
  {
    public List<AddCardToWXCardPackage.WXCardItem> cardArrary;
    
    public Req()
    {
      GMTrace.i(10871635968L, 81);
      GMTrace.o(10871635968L, 81);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(11140071424L, 83);
      if ((this.cardArrary == null) || (this.cardArrary.size() == 0) || (this.cardArrary.size() > 40))
      {
        GMTrace.o(11140071424L, 83);
        return false;
      }
      Iterator localIterator = this.cardArrary.iterator();
      while (localIterator.hasNext())
      {
        AddCardToWXCardPackage.WXCardItem localWXCardItem = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
        if ((localWXCardItem == null) || (localWXCardItem.cardId == null) || (localWXCardItem.cardId.length() > 1024) || ((localWXCardItem.cardExtMsg != null) && (localWXCardItem.cardExtMsg.length() > 1024)))
        {
          GMTrace.o(11140071424L, 83);
          return false;
        }
      }
      GMTrace.o(11140071424L, 83);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(11005853696L, 82);
      GMTrace.o(11005853696L, 82);
      return 9;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(11274289152L, 84);
      super.toBundle(paramBundle);
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.object();
        localJSONStringer.key("card_list");
        localJSONStringer.array();
        Iterator localIterator = this.cardArrary.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            Object localObject = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
            localJSONStringer.object();
            localJSONStringer.key("card_id");
            localJSONStringer.value(((AddCardToWXCardPackage.WXCardItem)localObject).cardId);
            localJSONStringer.key("card_ext");
            if (((AddCardToWXCardPackage.WXCardItem)localObject).cardExtMsg == null)
            {
              localObject = "";
              localJSONStringer.value(localObject);
              localJSONStringer.endObject();
              continue;
              paramBundle.putString("_wxapi_add_card_to_wx_card_list", localJSONStringer.toString());
            }
          }
        }
      }
      catch (Exception localException)
      {
        Log.e("MicroMsg.AddCardToWXCardPackage", "Req.toBundle exception:" + localException.getMessage());
      }
      for (;;)
      {
        GMTrace.o(11274289152L, 84);
        return;
        String str = localException.cardExtMsg;
        break;
        localJSONStringer.endArray();
        localJSONStringer.endObject();
      }
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public List<AddCardToWXCardPackage.WXCardItem> cardArrary;
    
    public Resp()
    {
      GMTrace.i(11408506880L, 85);
      GMTrace.o(11408506880L, 85);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(11542724608L, 86);
      fromBundle(paramBundle);
      GMTrace.o(11542724608L, 86);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(11811160064L, 88);
      if ((this.cardArrary == null) || (this.cardArrary.size() == 0))
      {
        GMTrace.o(11811160064L, 88);
        return false;
      }
      GMTrace.o(11811160064L, 88);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(12079595520L, 90);
      super.fromBundle(paramBundle);
      if (this.cardArrary == null) {
        this.cardArrary = new LinkedList();
      }
      paramBundle = paramBundle.getString("_wxapi_add_card_to_wx_card_list");
      if ((paramBundle != null) && (paramBundle.length() > 0)) {
        try
        {
          paramBundle = ((JSONObject)new JSONTokener(paramBundle).nextValue()).getJSONArray("card_list");
          int i = 0;
          while (i < paramBundle.length())
          {
            JSONObject localJSONObject = paramBundle.getJSONObject(i);
            AddCardToWXCardPackage.WXCardItem localWXCardItem = new AddCardToWXCardPackage.WXCardItem();
            localWXCardItem.cardId = localJSONObject.optString("card_id");
            localWXCardItem.cardExtMsg = localJSONObject.optString("card_ext");
            localWXCardItem.cardState = localJSONObject.optInt("is_succ");
            this.cardArrary.add(localWXCardItem);
            i += 1;
          }
          GMTrace.o(12079595520L, 90);
          return;
        }
        catch (Exception paramBundle) {}
      }
      GMTrace.o(12079595520L, 90);
    }
    
    public int getType()
    {
      GMTrace.i(11676942336L, 87);
      GMTrace.o(11676942336L, 87);
      return 9;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(11945377792L, 89);
      super.toBundle(paramBundle);
      JSONStringer localJSONStringer = new JSONStringer();
      AddCardToWXCardPackage.WXCardItem localWXCardItem;
      try
      {
        localJSONStringer.object();
        localJSONStringer.key("card_list");
        localJSONStringer.array();
        Iterator localIterator = this.cardArrary.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            localWXCardItem = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
            localJSONStringer.object();
            localJSONStringer.key("card_id");
            localJSONStringer.value(localWXCardItem.cardId);
            localJSONStringer.key("card_ext");
            if (localWXCardItem.cardExtMsg == null)
            {
              String str1 = "";
              localJSONStringer.value(str1);
              localJSONStringer.key("is_succ");
              localJSONStringer.value(localWXCardItem.cardState);
              localJSONStringer.endObject();
              continue;
              paramBundle.putString("_wxapi_add_card_to_wx_card_list", localJSONStringer.toString());
            }
          }
        }
      }
      catch (Exception localException)
      {
        Log.e("MicroMsg.AddCardToWXCardPackage", "Resp.toBundle exception:" + localException.getMessage());
      }
      for (;;)
      {
        GMTrace.o(11945377792L, 89);
        return;
        String str2 = localWXCardItem.cardExtMsg;
        break;
        localJSONStringer.endArray();
        localJSONStringer.endObject();
      }
    }
  }
  
  public static final class WXCardItem
  {
    public String cardExtMsg;
    public String cardId;
    public int cardState;
    
    public WXCardItem()
    {
      GMTrace.i(12213813248L, 91);
      GMTrace.o(12213813248L, 91);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\AddCardToWXCardPackage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */