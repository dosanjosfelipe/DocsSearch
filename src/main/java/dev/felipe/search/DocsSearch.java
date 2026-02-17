package dev.felipe.search;

import dev.felipe.search.cli.ArgumentParser;

public class DocsSearch {

    public static void main(String[] args) {
        ArgumentParser argumentParser = new ArgumentParser();

        argumentParser.parse(args);
    }
}
