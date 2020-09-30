package br.com.everaldojunior.xtpp.antlr;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import antlr4.antlr.XTPlusPlusGrammar;

public class App
{
    //region Constructor

    public static void main(String[] args) 
    {
        try
        {
            var path = "src\\main\\java\\samples\\Sample1.xtpp";
            var charStreams = CharStreams.fromFileName(path);
            var lexer = new XTPlusPlusGrammar(charStreams);
            
            while (lexer.nextToken().getType() != Token.EOF)
            {
                System.out.println();
            }
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
    
    //endregion
}