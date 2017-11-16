package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acz
  extends azh
{
  public int usX;
  public azp usY;
  public String usZ;
  public String uta;
  public String utb;
  
  public acz()
  {
    GMTrace.i(3645085057024L, 27158);
    GMTrace.o(3645085057024L, 27158);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3645219274752L, 27159);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.usY == null) {
        throw new b("Not all required fields were included: QRCode");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.usY != null)
      {
        paramVarArgs.fm(2, this.usY.aYq());
        this.usY.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.usX);
      if (this.usZ != null) {
        paramVarArgs.e(6, this.usZ);
      }
      if (this.uta != null) {
        paramVarArgs.e(7, this.uta);
      }
      if (this.utb != null) {
        paramVarArgs.e(8, this.utb);
      }
      GMTrace.o(3645219274752L, 27159);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.usY != null) {
        i = paramInt + b.a.a.a.fj(2, this.usY.aYq());
      }
      i += b.a.a.a.fh(5, this.usX);
      paramInt = i;
      if (this.usZ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.usZ);
      }
      i = paramInt;
      if (this.uta != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.uta);
      }
      paramInt = i;
      if (this.utb != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.utb);
      }
      GMTrace.o(3645219274752L, 27159);
      return paramInt;
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
      if (this.usY == null) {
        throw new b("Not all required fields were included: QRCode");
      }
      GMTrace.o(3645219274752L, 27159);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acz localacz = (acz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 3: 
      case 4: 
      default: 
        GMTrace.o(3645219274752L, 27159);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3645219274752L, 27159);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacz.usY = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3645219274752L, 27159);
        return 0;
      case 5: 
        localacz.usX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3645219274752L, 27159);
        return 0;
      case 6: 
        localacz.usZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3645219274752L, 27159);
        return 0;
      case 7: 
        localacz.uta = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3645219274752L, 27159);
        return 0;
      }
      localacz.utb = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3645219274752L, 27159);
      return 0;
    }
    GMTrace.o(3645219274752L, 27159);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\acz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */