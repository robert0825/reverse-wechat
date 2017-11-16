package com.tencent.mm.plugin.fts.a.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class j
  extends i
{
  public j()
  {
    GMTrace.i(18635997315072L, 138849);
    GMTrace.o(18635997315072L, 138849);
  }
  
  private void a(Pattern paramPattern)
  {
    int i = 0;
    GMTrace.i(18636265750528L, 138851);
    this.lxj = paramPattern.split(this.content);
    this.lxk = new int[this.lxj.length];
    int j = 0;
    while (i < this.lxk.length)
    {
      this.lxk[i] = j;
      j += this.lxj[i].length() + 1;
      i += 1;
    }
    GMTrace.o(18636265750528L, 138851);
  }
  
  private void aCm()
  {
    GMTrace.i(18636534185984L, 138853);
    switch (this.gRk)
    {
    default: 
      GMTrace.o(18636534185984L, 138853);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    a(c.a.lws);
    String[] arrayOfString1 = c.a.lwr.split(this.lxg);
    byte[] arrayOfByte = this.content.getBytes();
    int i = 0;
    label80:
    int n;
    int k;
    int j;
    String str;
    String[] arrayOfString2;
    if (i < arrayOfString1.length)
    {
      n = Integer.valueOf(arrayOfString1[i]).intValue();
      int m = new String(arrayOfByte, 0, Integer.valueOf(arrayOfString1[(i + 1)]).intValue()).length();
      k = Arrays.binarySearch(this.lxk, m);
      j = k;
      if (k < 0) {
        j = -k - 2;
      }
      str = this.lxj[j];
      arrayOfString2 = c.a.lwt.split(str);
      m -= this.lxk[j];
      k = 0;
      label178:
      if (k >= arrayOfString2.length) {
        break label272;
      }
      m = m - arrayOfString2[k].length() - 1;
      if (m < 0)
      {
        str = arrayOfString2[k];
        k = com.tencent.mm.plugin.fts.a.c.lwk[k];
      }
    }
    for (;;)
    {
      if (k > 0) {
        localArrayList.add(new d(j, n, k, str, arrayOfString2[(arrayOfString2.length - 1)]));
      }
      i += 2;
      break label80;
      k += 1;
      break label178;
      this.lxl = localArrayList;
      break;
      label272:
      k = -1;
      str = null;
    }
  }
  
  public final void aCl()
  {
    GMTrace.i(18636399968256L, 138852);
    if (bg.nm(this.lxg))
    {
      GMTrace.o(18636399968256L, 138852);
      return;
    }
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(18636399968256L, 138852);
      return;
      switch (this.gRk)
      {
      case 4: 
      case 5: 
      case 8: 
      case 9: 
      case 10: 
      default: 
      case 11: 
        for (;;)
        {
          try
          {
            i = Integer.valueOf(c.a.lwr.split(this.lxg)[1]).intValue();
            this.lxh = new String(this.content.getBytes(), 0, i).length();
            this.lxi = this.content;
            GMTrace.o(18636399968256L, 138852);
            return;
          }
          catch (Exception localException3)
          {
            int i;
            String[] arrayOfString1;
            int k;
            int j;
            String[] arrayOfString2;
            this.lxh = Integer.MAX_VALUE;
            this.lxi = "";
            GMTrace.o(18636399968256L, 138852);
            return;
          }
          try
          {
            arrayOfString1 = c.a.lwr.split(this.lxg);
            a(c.a.lws);
            i = Integer.valueOf(arrayOfString1[1]).intValue();
            k = new String(this.content.getBytes(), 0, i).length();
            j = Arrays.binarySearch(this.lxk, k);
            i = j;
            if (j < 0) {
              i = -j - 2;
            }
            this.lxh = (k - this.lxk[i]);
            this.lxi = this.lxj[i];
            GMTrace.o(18636399968256L, 138852);
            return;
          }
          catch (Exception localException1)
          {
            this.lxh = Integer.MAX_VALUE;
            this.lxi = "";
            GMTrace.o(18636399968256L, 138852);
            return;
          }
        }
      }
      try
      {
        arrayOfString2 = c.a.lwr.split(this.lxg);
        a(c.a.lwv);
        i = Integer.valueOf(arrayOfString2[1]).intValue();
        i = new String(this.content.getBytes(), 0, i).length();
        this.lxh = Arrays.binarySearch(this.lxk, i);
        if (this.lxh < 0) {
          this.lxh = (-this.lxh - 2);
        }
        this.lxi = this.lxj[this.lxh];
        GMTrace.o(18636399968256L, 138852);
        return;
      }
      catch (Exception localException2)
      {
        this.lxh = Integer.MAX_VALUE;
        this.lxi = "";
        GMTrace.o(18636399968256L, 138852);
        return;
      }
      aCm();
    }
  }
  
  public final void d(String[] paramArrayOfString, String paramString)
  {
    GMTrace.i(18636668403712L, 138854);
    if (paramArrayOfString.length > 1) {
      this.lxn = 1;
    }
    while (this.type == 131075)
    {
      if (System.currentTimeMillis() - this.timestamp >= 1209600000L) {
        break label375;
      }
      this.lwM += 50;
      String str = q.zE();
      if (this.gRk == 38)
      {
        HashSet localHashSet = new HashSet();
        if (this.lxl != null)
        {
          Iterator localIterator = this.lxl.iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              d locald = (d)localIterator.next();
              if (!str.equals(locald.fsF))
              {
                localHashSet.add(Integer.valueOf(locald.lwI));
                continue;
                this.lxn = 0;
                break;
              }
            }
          }
        }
        if (localHashSet.size() >= this.lxe - 1L)
        {
          this.lwM += 20;
          this.lxo = true;
        }
        if ((paramArrayOfString.length > 1) && (this.content.contains(paramString)))
        {
          this.lxn = 2;
          this.lwM += 5;
        }
        if (this.lxe <= 15L) {
          this.lxq = 1;
        }
      }
      if (((this.gRk == 5) || (this.gRk == 1)) && (this.content.contains(paramString)))
      {
        if (paramArrayOfString.length > 1) {
          this.lxn = 2;
        }
        this.lwM += 10;
      }
      GMTrace.o(18636668403712L, 138854);
      return;
    }
    if (this.type == 131072)
    {
      if (System.currentTimeMillis() - this.timestamp < 1105032704L) {
        this.lwM += 50;
      }
      if (((this.gRk == 5) || (this.gRk == 1)) && (this.content.contains(paramString)))
      {
        if (paramArrayOfString.length > 1) {
          this.lxn = 2;
        }
        this.lwM += 10;
      }
    }
    label375:
    GMTrace.o(18636668403712L, 138854);
  }
  
  public final j e(Cursor paramCursor)
  {
    GMTrace.i(18636131532800L, 138850);
    this.lxc = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.gRk = paramCursor.getInt(2);
    this.lxe = paramCursor.getLong(3);
    this.lwH = paramCursor.getString(4);
    this.timestamp = paramCursor.getLong(5);
    if (paramCursor.getColumnCount() >= 7) {
      this.content = paramCursor.getString(6);
    }
    if (paramCursor.getColumnCount() >= 8) {
      this.lxg = paramCursor.getString(7);
    }
    GMTrace.o(18636131532800L, 138850);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */