package com.tencent.mm.plugin.location.a;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> eNM;
  public double latitude;
  public double longitude;
  public String mwD;
  public long timestamp;
  public String username;
  
  public a()
  {
    GMTrace.i(9725013917696L, 72457);
    this.eNM = new LinkedList();
    GMTrace.o(9725013917696L, 72457);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(9725148135424L, 72458);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.d(2, 1, this.eNM);
      paramVarArgs.a(3, this.longitude);
      paramVarArgs.a(4, this.latitude);
      if (this.mwD != null) {
        paramVarArgs.e(5, this.mwD);
      }
      paramVarArgs.T(6, this.timestamp);
      GMTrace.o(9725148135424L, 72458);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label530;
      }
    }
    label530:
    for (paramInt = b.a.a.b.b.a.f(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.c(2, 1, this.eNM) + (b.a.a.b.b.a.cK(3) + 8) + (b.a.a.b.b.a.cK(4) + 8);
      paramInt = i;
      if (this.mwD != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.mwD);
      }
      i = b.a.a.a.S(6, this.timestamp);
      GMTrace.o(9725148135424L, 72458);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.eNM.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.username == null) {
          throw new b("Not all required fields were included: username");
        }
        GMTrace.o(9725148135424L, 72458);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        a locala1 = (a)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(9725148135424L, 72458);
          return -1;
        case 1: 
          locala1.username = locala.yqV.readString();
          GMTrace.o(9725148135424L, 72458);
          return 0;
        case 2: 
          locala1.eNM.add(locala.yqV.readString());
          GMTrace.o(9725148135424L, 72458);
          return 0;
        case 3: 
          locala1.longitude = locala.yqV.readDouble();
          GMTrace.o(9725148135424L, 72458);
          return 0;
        case 4: 
          locala1.latitude = locala.yqV.readDouble();
          GMTrace.o(9725148135424L, 72458);
          return 0;
        case 5: 
          locala1.mwD = locala.yqV.readString();
          GMTrace.o(9725148135424L, 72458);
          return 0;
        }
        locala1.timestamp = locala.yqV.nk();
        GMTrace.o(9725148135424L, 72458);
        return 0;
      }
      GMTrace.o(9725148135424L, 72458);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */