package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
  implements f
{
  private byte[] aAe;
  private Map<String, g> aBq;
  private Uri mUri;
  
  public d(f paramf)
  {
    this.mUri = paramf.getUri();
    this.aAe = paramf.getData();
    HashMap localHashMap = new HashMap();
    paramf = paramf.nb().entrySet().iterator();
    while (paramf.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramf.next();
      if (localEntry.getKey() != null) {
        localHashMap.put(localEntry.getKey(), ((g)localEntry.getValue()).km());
      }
    }
    this.aBq = Collections.unmodifiableMap(localHashMap);
  }
  
  public final byte[] getData()
  {
    return this.aAe;
  }
  
  public final Uri getUri()
  {
    return this.mUri;
  }
  
  public final Map<String, g> nb()
  {
    return this.aBq;
  }
  
  public final String toString()
  {
    boolean bool = Log.isLoggable("DataItem", 3);
    StringBuilder localStringBuilder = new StringBuilder("DataItemEntity{ ");
    localStringBuilder.append("uri=" + this.mUri);
    Object localObject2 = new StringBuilder(", dataSz=");
    if (this.aAe == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(this.aAe.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + this.aBq.size());
      if ((!bool) || (this.aBq.isEmpty())) {
        break label249;
      }
      localStringBuilder.append(", assets=[");
      localObject2 = this.aBq.entrySet().iterator();
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = ", ")
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        localStringBuilder.append((String)localObject1 + (String)localEntry.getKey() + ": " + ((g)localEntry.getValue()).getId());
      }
    }
    localStringBuilder.append("]");
    label249:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */