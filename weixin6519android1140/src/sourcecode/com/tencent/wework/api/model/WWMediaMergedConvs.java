package com.tencent.wework.api.model;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WWMediaMergedConvs
  extends WWMediaMessage.WWMediaObject
{
  public List<WWMediaConversation> ymG = new ArrayList();
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while ((this.ymG == null) || (this.ymG.size() == 0)) {
      return false;
    }
    Iterator localIterator = this.ymG.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (((BaseMessage)localIterator.next()).checkArgs());
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putInt("_wwmergedconvobject_messageslen", this.ymG.size());
    int i = 0;
    while (i < this.ymG.size())
    {
      paramBundle.putBundle("_wwmergedconvobject_messages" + i, BaseMessage.b((BaseMessage)this.ymG.get(i)));
      i += 1;
    }
    super.toBundle(paramBundle);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wework\api\model\WWMediaMergedConvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */