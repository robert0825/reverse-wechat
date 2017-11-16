package com.tencent.mm.plugin.talkroom.a;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bir;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bm.a
{
  public LinkedList<bir> eNM;
  public int nvM;
  public String username;
  
  public a()
  {
    GMTrace.i(5208587370496L, 38807);
    this.eNM = new LinkedList();
    GMTrace.o(5208587370496L, 38807);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5208721588224L, 38808);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.username != null) {
        paramVarArgs.e(1, this.username);
      }
      paramVarArgs.d(2, 8, this.eNM);
      paramVarArgs.fk(3, this.nvM);
      GMTrace.o(5208721588224L, 38808);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.username != null) {
        paramInt = b.a.a.b.b.a.f(1, this.username) + 0;
      }
      i = b.a.a.a.c(2, 8, this.eNM);
      int j = b.a.a.a.fh(3, this.nvM);
      GMTrace.o(5208721588224L, 38808);
      return paramInt + i + j;
    }
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
      GMTrace.o(5208721588224L, 38808);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      a locala = (a)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(5208721588224L, 38808);
        return -1;
      case 1: 
        locala.username = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(5208721588224L, 38808);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bir();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bir)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locala.eNM.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(5208721588224L, 38808);
        return 0;
      }
      locala.nvM = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(5208721588224L, 38808);
      return 0;
    }
    GMTrace.o(5208721588224L, 38808);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */