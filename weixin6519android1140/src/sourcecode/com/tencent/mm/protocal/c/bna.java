package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bna
  extends azh
{
  public int kBk;
  public String kBl;
  public LinkedList<String> uXd;
  
  public bna()
  {
    GMTrace.i(3872584105984L, 28853);
    this.uXd = new LinkedList();
    GMTrace.o(3872584105984L, 28853);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3872718323712L, 28854);
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
      paramVarArgs.fk(2, this.kBk);
      if (this.kBl != null) {
        paramVarArgs.e(3, this.kBl);
      }
      paramVarArgs.d(4, 1, this.uXd);
      GMTrace.o(3872718323712L, 28854);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.kBk);
      paramInt = i;
      if (this.kBl != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.kBl);
      }
      i = b.a.a.a.c(4, 1, this.uXd);
      GMTrace.o(3872718323712L, 28854);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uXd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3872718323712L, 28854);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bna localbna = (bna)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3872718323712L, 28854);
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
          localbna.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3872718323712L, 28854);
        return 0;
      case 2: 
        localbna.kBk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3872718323712L, 28854);
        return 0;
      case 3: 
        localbna.kBl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3872718323712L, 28854);
        return 0;
      }
      localbna.uXd.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(3872718323712L, 28854);
      return 0;
    }
    GMTrace.o(3872718323712L, 28854);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */