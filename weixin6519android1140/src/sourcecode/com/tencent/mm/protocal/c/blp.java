package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blp
  extends azh
{
  public String tPP;
  public int tRC;
  public int tRD;
  public String ueZ;
  
  public blp()
  {
    GMTrace.i(3885334790144L, 28948);
    GMTrace.o(3885334790144L, 28948);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3885469007872L, 28949);
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
      paramVarArgs.fk(2, this.tRD);
      if (this.ueZ != null) {
        paramVarArgs.e(3, this.ueZ);
      }
      paramVarArgs.fk(4, this.tRC);
      if (this.tPP != null) {
        paramVarArgs.e(5, this.tPP);
      }
      GMTrace.o(3885469007872L, 28949);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRD);
      paramInt = i;
      if (this.ueZ != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.ueZ);
      }
      i = paramInt + b.a.a.a.fh(4, this.tRC);
      paramInt = i;
      if (this.tPP != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tPP);
      }
      GMTrace.o(3885469007872L, 28949);
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
      GMTrace.o(3885469007872L, 28949);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blp localblp = (blp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3885469007872L, 28949);
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
          localblp.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3885469007872L, 28949);
        return 0;
      case 2: 
        localblp.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3885469007872L, 28949);
        return 0;
      case 3: 
        localblp.ueZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3885469007872L, 28949);
        return 0;
      case 4: 
        localblp.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3885469007872L, 28949);
        return 0;
      }
      localblp.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3885469007872L, 28949);
      return 0;
    }
    GMTrace.o(3885469007872L, 28949);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\blp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */