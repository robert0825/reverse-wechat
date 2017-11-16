package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bui
  extends azh
{
  public String eDW;
  public int uKI;
  public String url;
  public int vcK;
  public int version;
  
  public bui()
  {
    GMTrace.i(3755814682624L, 27983);
    GMTrace.o(3755814682624L, 27983);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3755948900352L, 27984);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.eDW != null) {
        paramVarArgs.e(3, this.eDW);
      }
      paramVarArgs.fk(4, this.version);
      paramVarArgs.fk(5, this.vcK);
      paramVarArgs.fk(6, this.uKI);
      GMTrace.o(3755948900352L, 27984);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.eDW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eDW);
      }
      paramInt = b.a.a.a.fh(4, this.version);
      int j = b.a.a.a.fh(5, this.vcK);
      int k = b.a.a.a.fh(6, this.uKI);
      GMTrace.o(3755948900352L, 27984);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3755948900352L, 27984);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bui localbui = (bui)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3755948900352L, 27984);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbui.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 2: 
        localbui.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 3: 
        localbui.eDW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 4: 
        localbui.version = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      case 5: 
        localbui.vcK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3755948900352L, 27984);
        return 0;
      }
      localbui.uKI = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3755948900352L, 27984);
      return 0;
    }
    GMTrace.o(3755948900352L, 27984);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */